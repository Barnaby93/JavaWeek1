package project1;

import java.util.Random;

public class UniqueSum {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int a = rand.nextInt(5)+1;
		int b = rand.nextInt(5)+1;
		int c = rand.nextInt(5)+1;
		
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		System.out.println("The value of c is: " + c);
		System.out.println(Sum(a, b, c));


	}
	
	static int Sum (int a, int b, int c)
	{
		if ((a != b) && (a != c) && (b != c))
		{
			return a+b+c;
		}
		else if ((a != b) && (a != c) && (c == b))
		{
			return a;
		}
		else if ((c == a) && (c == b))
		{
			return 0;
		}
		else if (b == a)
		{
			return c;
		}
		else 
		{
			return b;
		}
		
	}

}
