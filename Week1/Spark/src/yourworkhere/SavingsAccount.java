package yourworkhere;

public class SavingsAccount extends Account {
	double mainBalance;
	int currentMonthlyWithdrawls;
	int maxMonthlyWithdrawls;
	
	public SavingsAccount() {
			
		}

	public SavingsAccount(String accountID, String firstName, String lastName) {
		
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountID=" + accountID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
