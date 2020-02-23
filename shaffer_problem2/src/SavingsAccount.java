
public class SavingsAccount
{
	static double annualInterestRate = 0;
	private double savingsBalance= 0;
	
	public SavingsAccount(double sB)
	{
		savingsBalance = sB;
	}
	
	void modifyInterestRate(double persent)
	{
		 annualInterestRate = persent;
		 System.out.printf("the new intrest rate is %.2f \n",annualInterestRate);
	}
	
	public double calculateMonthlyInterest(int time) 
	{
		for(int i=0;i<time; i++) 
		{
			savingsBalance += (savingsBalance * annualInterestRate/12);
			
			System.out.printf("monthly savings balance is %.2f \n",savingsBalance);
		}
		
		System.out.printf("total savings balance is %.2f \n",savingsBalance);
		return savingsBalance;
		
	}

}
