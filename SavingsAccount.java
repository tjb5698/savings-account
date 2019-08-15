
public class SavingsAccount {

	static double annualInterestRate=0;
	private double savingsBalance;
	
	public double calculateMonthlyInterest() 
	{
		savingsBalance=savingsBalance+savingsBalance*(annualInterestRate/12);
		return savingsBalance;
	}
	public static void setInterestRate(double newRate)
	{
		annualInterestRate=(newRate>=0 && newRate<=1.0)?newRate:0.04;
	}
	public void setSavingsBalance(double balance)
	{
		savingsBalance=balance;
	}
	
}
