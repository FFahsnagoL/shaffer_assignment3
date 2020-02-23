import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1
{
	public void quiz()
	{
		SecureRandom rand = new SecureRandom();
		boolean correct = false;
		
	 	int int1 = rand.nextInt(10); 
	 	int int2 = rand.nextInt(10); 
	 	
		double answer = int1*int2;

		while(correct == false)
		{
			askQuestion(int1,int2);

			double studans = readResponse();

			 correct = isAsnwerCorrect(answer, studans);
			 
			 if(correct == false)
			 {
			 	displayInorrectResponse();
			 }
		}

		displayCorrectResponse();

	}

	public void askQuestion(int int1, int int2)
	{
		System.out.printf("what is %d X %d", int1, int2);
	}

	public double readResponse()
	{
		Scanner in = new Scanner(System.in);
		

	 	System.out.print(" enter your answer:");

		double answer = in.nextDouble();
		
		
	
	 	return answer;

	}

	public boolean isAsnwerCorrect(double ans1, double ans2)
	{
	   if (Math.abs(ans1-ans2)< .001){
	   	 return true;
	   }
	   return false;
	}

	public void displayCorrectResponse()
	{
	System.out.println("Very good!");
	}

	public void displayInorrectResponse()
	{
	System.out.println(" No. Please try again");
	}

	public static void main(String[] args)
	{
		
		CAI1 app = new CAI1();
    	app.quiz();
		
	}
}

