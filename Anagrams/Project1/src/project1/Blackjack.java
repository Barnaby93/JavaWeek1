package project1;

import java.util.Random;

public class Blackjack {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int a = rand.nextInt(21)+1;
		
		int b = rand.nextInt(21)+1;
		
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println("the winning number is " + blackjack(a, b));
	}
	
	static int blackjack(int a, int b)
	{
		
		
		if (a > b)
		{
			return a;
		}
		else if (b > a)
		{
			return b;
		}
		else if (a > 22 && b >22)
		{
			return 0;
		}
		else 
		{
			return -1;
		}
	}

}
