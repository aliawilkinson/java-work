package yourworkhere;

public class Ledger {
	//the single instance of Ledger
	private static final Ledger instance = new Ledger();

	//private constructor    
	private Ledger() {}

	//method to return the single instance
	public static Ledger getInstance(){
	    return instance;
	}
}
