package ignore.workers;

import java.awt.Component;
import java.awt.Toolkit;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.SwingWorker;


public class ViewAccountsWorker extends SwingWorker<Void, Void> {
	
	private String minimum;
	private String type;
	
	public ViewAccountsWorker(){}
	
	public ViewAccountsWorker(String minimum, String type){
		this.minimum = minimum;
		this.type = type;
	}

	@Override
	protected Void doInBackground() throws Exception {		
		System.out.println("***************************************");
		Double val = null;
		
		try {
			val = Double.parseDouble(minimum);
		}catch (NumberFormatException e) {
			System.out.println("Please enter only numeric values for the minimum value");
			return null;
		}

		// Checks if IAccountManager exists
		try {
			Class c = Class.forName("yourworkhere.Reporter");
			System.out.println("Running methods on Reporter...");
			//run code from Reporter
			printAccountMethod(c);
			runGetNumAccounts(c);
			runGetAccountsWithMinimum(c, val);
			runGetNumAccountsByType(c, type);
			
		} catch (ClassNotFoundException e) {
			System.out.println(
					"You cannot use this functionality yet. Did you create the class Reporter? Is it in the yourworkhere package?");
		}catch(Exception e) {
			e.printStackTrace();
		}

		this.setProgress(100);
		return null;
	}
	
	private void runGetNumAccounts(Class c) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		Method m = c.getDeclaredMethod("getNumAccounts");
		m.setAccessible(true);
		
		//get ledger for constructor
		Object ledger = getLedger();
		
		Constructor constructor = c.getConstructor(ledger.getClass());
		constructor.setAccessible(true);
		
		System.out.println("running getNumAccounts()...");
		int result = (Integer)m.invoke(constructor.newInstance(ledger));
		System.out.println("returned " + result);
	}
	
	private void runGetAccountsWithMinimum(Class c, double min) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		Method m = c.getDeclaredMethod("getAccountsWithMinimum", Double.TYPE);
		m.setAccessible(true);
		
		//get ledger for constructor
		Object ledger = getLedger();
		
		Constructor constructor = c.getConstructor(ledger.getClass());
		constructor.setAccessible(true);
		
		System.out.println("running getAccountsWithMinimum()...");
		int result = (Integer)m.invoke(constructor.newInstance(ledger), min);
		System.out.println("number of accounts with minimum amount: " + min +  " is "  + result);
	}
	
	private void printAccountMethod(Class c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Method m = c.getDeclaredMethod("printAllAccounts");
		m.setAccessible(true);
		
		//get ledger for constructor
		Object ledger = getLedger();
		
		Constructor constructor = c.getConstructor(ledger.getClass());
		constructor.setAccessible(true);
		System.out.println("running printAllAccounts()...");
		m.invoke(constructor.newInstance(ledger));
	}
	
	private void runGetNumAccountsByType(Class c, String type) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Method m = c.getDeclaredMethod("getNumAccountsByType", String.class);
		m.setAccessible(true);
		
		//get ledger for constructor
		Object ledger = getLedger();
		
		Constructor constructor = c.getConstructor(ledger.getClass());
		constructor.setAccessible(true);
		
		System.out.println("running getNumAccountsByType()...");
		int result = (Integer)m.invoke(constructor.newInstance(ledger), type);
		System.out.println("number of accounts with type: " + type +  "  "  + result);
		
	}
	
	private Object getLedger() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		Class c = Class.forName("yourworkhere.Ledger");
		
		Method m = c.getDeclaredMethod("getInstance");
		m.setAccessible(true);
		
		Object result = m.invoke(null);
		return result;
	}

	@Override
	public void done() {
		Component[] components;
		Toolkit.getDefaultToolkit().beep();
	}
}
