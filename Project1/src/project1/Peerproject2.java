package project1;

import java.util.Scanner;

public class Peerproject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your number ");
		int guess = s.nextInt();
		int actual=10;
		
		
		while(guess!=actual){
			int diff=guess-actual;
			
			
			if (diff>0 && diff<10)
				System.out.println("Hot, Go Lower");
			
			else if ( diff<=0 && diff>-10)
				System.out.println("Hot, Go Higher");
			else if ( diff>=10 && diff<50)
				System.out.println("Warm, Go Lower");
			else if ( diff<=-10 && diff>-50)
				System.out.println("Warm, Go Higher");
			else if (diff>=50)
				System.out.println("Cold, Go Lower");
			else if (diff<=-50)
				System.out.println("Cold, Go Lower");
			
						
			Scanner s1 =new Scanner(System.in);
			System.out.println("Enter new number ");
			guess=s.nextInt();
			
		}

		
			System.out.println("Got the number! its " +guess);
	}

}
