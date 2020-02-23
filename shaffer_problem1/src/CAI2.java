import java.security.SecureRandom;
import java.util.Scanner;
	
public class CAI2 {
	
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
			int rando = 0;
			
			SecureRandom rand = new SecureRandom();
			
		 String ansString= null;
			
			 rando = rand.nextInt(03);
			
			switch (rando) 
			{ 
		        case 0: 
		            ansString = "Very good!"; 
		            break; 
		        case 1: 
		            ansString = "Excellent!"; 
		            break; 
		        case 2: 
		            ansString = "Nice work!"; 
		            break; 
		        case 3: 
		            ansString = "Keep up the good work!"; 
		            break;
		        }
		System.out.println(ansString);
		}

		public void displayInorrectResponse()
		{
			int rando = 0;
			SecureRandom rand = new SecureRandom();
			String ansString = null;
			
		 rando = rand.nextInt(03);
			switch (rando) 
			{ 
		        case 0: 
		            ansString = "No. Please try again."; 
		            break; 
		        case 1: 
		            ansString = "Wrong. Try once more."; 
		            break; 
		        case 2: 
		            ansString = "Don’t give up!"; 
		            break; 
		        case 3: 
		            ansString = "No. Keep trying."; 
		            break;
		        }
		System.out.println(ansString);
		}

		public static void main(String[] args)
		{
			
			CAI2 app2 = new CAI2();
	    	app2.quiz();
			
		}
	}
