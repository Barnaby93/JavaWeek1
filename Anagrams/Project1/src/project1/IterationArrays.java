package project1;

import java.lang.reflect.Array;
import java.util.Random;

public class IterationArrays {

	public static void main(String[] args) 
	{
		int[] arrayOfInts = new int[10];
		
		for (int x = 0; x <10; x++)
		{
			Random rand = new Random();
			int n = rand.nextInt(100)+1;
			arrayOfInts[x]=n;
			System.out.println(arrayOfInts[x]);
		}
		
		for (int i = 0; i < arrayOfInts.length; i++)
		{
			System.out.println("");
			System.out.println(arrayOfInts[i]);
			arrayOfInts[i] = arrayOfInts[i] * 10; 
			System.out.println(arrayOfInts[i]);
		}
				
	}

}