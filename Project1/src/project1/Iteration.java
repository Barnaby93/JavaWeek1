package project1;

public class Iteration {

	public static void main(String[] args) 
	{
		for (int x=0; x < 10; x++)
			{
			System.out.println(Conditionals2(20,20,false));
			}
	}
	
	static int Conditionals2(int a, int b, boolean c)
	{
		if (a == 0 | b ==0)
		{
			if (a == 0)
			{
				return b;
			}
			else 
			{ 
				return a;
			}
		}
		else if (c == false)
		{
			return a*b;
		}
		else 
		{
			return a+b;
		}

}
}