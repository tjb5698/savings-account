
public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1= new SavingsAccount();
		SavingsAccount saver2= new SavingsAccount();
		
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		SavingsAccount.setInterestRate(0.04);
		
		System.out.println("Savings Account Balances");
		System.out.printf("%-10s%-10s%-10s\n","Month","Saver1","Saver2");

		for (int month=1;month<=12;month++)
		{
			System.out.printf("%-10d%-10.2f%-10.2f\n",month,saver1.calculateMonthlyInterest(),saver2.calculateMonthlyInterest());
		}
		SavingsAccount.setInterestRate(0.05);
		System.out.printf("%-10s%-10.2f%-10.2f","13",saver1.calculateMonthlyInterest(),saver2.calculateMonthlyInterest());
		
	}

}
