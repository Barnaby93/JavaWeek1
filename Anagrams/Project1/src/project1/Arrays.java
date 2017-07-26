package project1;
import java.util.Random;

public class Arrays {

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
		//System.out.println("");
		//System.out.println(arrayOfInts[5]);
		
		System.out.println(project1.Conditionals2.Conditionals2(arrayOfInts[4],arrayOfInts[7], true));
		
	}

}
