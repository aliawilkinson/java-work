package ignore.workers;

import java.awt.Component;
import java.awt.Toolkit;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class AddAccountWorker extends SwingWorker<Void, Void>{
	
	private String accountType;
	private JComboBox comboBox;
	
	
	
	public AddAccountWorker() {}
	public AddAccountWorker(String accountType, JComboBox comboBox) {
		this.accountType = accountType;
		this.comboBox = comboBox;
	}

	@Override
    protected Void doInBackground() throws Exception {
		System.out.println("***************************************");
		System.out.println("creating " + this.accountType + " account...");
		Thread.sleep(500);
        
        try {
        	//get the current instance of Ledger
        	Class c = Class.forName("yourworkhere.Ledger");
        	
        	//create Account in Ledger
        	Object ledger = getLedger(c, "getInstance");
        	
        	//create account
        	Object result = createAccount(c, ledger, this.accountType);
        	System.out.println(result);
        	
        	//obtain the id
        	Class accountClass = Class.forName("yourworkhere.Account");
        	String id = getAccountID(accountClass, "getAccountID", result);
        	

        	comboBox.addItem(id);
            
        }catch(ClassNotFoundException e) {
        	System.out.println("You must implement the Ledger class first before you can use this button");
        	
        }/*catch(Exception e) {
        	e.printStackTrace();
        }*/
       
        System.out.println("***************************************");
        this.setProgress(100);
        return null;
    }
	
	
	
	private Object getLedger(Class c, String method) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method m = c.getDeclaredMethod(method);
		m.setAccessible(true);
		
		Object result = m.invoke(null);
		return result;
	}
	
	
	private Map getAccountMap(Class c, String method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		Method m = c.getDeclaredMethod(method);
		m.setAccessible(true);
		
		Constructor constructor = c.getConstructor();
		constructor.setAccessible(true);
		
		Object result = m.invoke(constructor.newInstance());
		result = (Map)result;
		return (Map) result;
	}
	
	private String getAccountID(Class c, String method, Object o) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method m = c.getDeclaredMethod(method);
		m.setAccessible(true);
		
		
		Object result = m.invoke(o);
		System.out.println("invoked get ID: " + result);
		return (String)result;
	}
	private Object createAccount(Class c, Object o, String type) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method m = c.getDeclaredMethod("createAccount", String.class, String.class, String.class);
		m.setAccessible(true);
		
		Object result = m.invoke(o, type, null, null);
		return result;
	}
	
	private Object createAccount(Class c, String method, String type) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Method m = c.getDeclaredMethod(method, String.class, String.class, String.class);
		m.setAccessible(true);
		
		Object instance = null;
		
		Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            instance = constructor.newInstance();
            break;
        }
		//Constructor constructor = c.getConstructor();
		//constructor.setAccessible(true);
		
		
		
		Object result = m.invoke(instance, type, null, null);
		
		return result;
		/*
		//convert result to Account
		Class accountClass = Class.forName("yourworkhere.Account");
		
		
		result = (String)result;
		return (String) result;
		*/
	}
	
	@Override
    public void done() {
        Component[] components;
        Toolkit.getDefaultToolkit().beep();
    }
}
