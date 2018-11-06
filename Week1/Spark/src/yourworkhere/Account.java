package yourworkhere;

public abstract class Account {
	public static void main(String[] args) {
		String accountID;

		double balance;

		String accountType;

		String firstName;

		String lastName;	
	}
	//marking variables private
	
	protected String accountID;
	
	protected double balance;

	protected String accountType;

	protected String firstName;

	protected String lastName;	
	
	//getter
	public String getAccountID(){
	    return this.getAccountID();
	}
	
	//setter
	public void setAccountID(String accountID){
	    this.accountID = accountID;
	}
}
