
public class SavingsAccountTest {

	public static void main(String[] args)
	{
		
		SavingsAccount saver1 = new SavingsAccount(2000.00);
    	SavingsAccount saver2 = new SavingsAccount(3000.00);
    	saver1.modifyInterestRate(.04);

    	int months=12;
    	
		saver1.calculateMonthlyInterest(months);
		saver2.calculateMonthlyInterest(months);
		
		saver1.modifyInterestRate(.05);
		
		 months =1;
		 
		saver1.calculateMonthlyInterest(months);
		saver2.calculateMonthlyInterest(months);
	}


	
}
