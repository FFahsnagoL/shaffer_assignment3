
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4
{
	public void quiz()
	{
		int cont = 0 ;
		
		while( cont != 1)
		{
			int corr = 0 ;
			int count = 0 ;
			
			askDifficulty();

			int diff = generateQuestionArgument(readDifficulty());

			for(int i = 0; i< 10; i++)
			{
				SecureRandom rand = new SecureRandom();
				boolean correct = false;
				
				int int1 = rand.nextInt(diff); 
	 			int int2 = rand.nextInt(diff);

				double answer = int1*int2;

				askQuestion(int1,int2);

				double studans = readResponse();

			 	correct = isAsnwerCorrect(answer, studans);
			 
				if(correct == false)
			 	{
			 		displayInorrectResponse();
			 	}

				else
			 	{
			 		displayCorrectResponse();
			 		corr++;
			 	}
				
			 	count ++;	
			}
			
			cont = displayCompletionMessage(corr,count);
		}

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
		
		 rando = rand.nextInt(04);
		
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

	public int displayCompletionMessage(int fin, int count)
	{
		double x = fin;
		double y = count;
	
 		double perst = (x / y) *100 ;

 		System.out.printf("your score is:%.0f",perst);
 		System.out.println("%");
 	
 		if(perst<75)
 		{
 			System.out.println("Please ask your teacher for extra help.");
 		}
 		else
 		{
			System.out.println("Congratulations, you are ready to go to the next level!");
 		}

		int end = retry();

		return end;
	}
	
	public int retry()
	{
		System.out.println("");
		System.out.println("would you like try ten more problems?");
		System.out.println("enter any number to continue");
		System.out.println("enter 1 to escape");
		Scanner in = new Scanner(System.in);
		int ret = in.nextInt();
		
		return ret;
	}
	
	public void askDifficulty()
	{
		System.out.println("please choose a difficulty:");

		System.out.println("A difficulty level of 1 range of 0-9");
		System.out.println("A difficulty level of 2 range of 0-99");
		System.out.println("A difficulty level of 3 range of 0-999");
		System.out.println("A difficulty level of 4 range of 0-9999");
	}

	public int readDifficulty()
	{
		Scanner in = new Scanner(System.in);
		
	 	System.out.print("enter your dissired difficulty:");

		int difficulty = in.nextInt();

		return difficulty;

	}

	public int generateQuestionArgument(int rando)
	{
		int dif = 0;
		
		switch (rando) 
		{ 
	        case 1: 
	             dif = 10; 
	            break; 
	        case 2: 
	             dif = 100; 
	            break; 
	        case 3: 
	             dif = 1000; 
	            break; 
	        case 4: 
	             dif = 10000; 
	            break;
	     }

		return dif;
	 	
	}

	public static void main(String[] args)
	{
		
		CAI4 app4 = new CAI4();
    	app4.quiz();
		
	}

}