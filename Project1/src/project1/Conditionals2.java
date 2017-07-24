package project1;

public class Conditionals2 {

	public static void main(String[] args) 
	{
		System.out.println(Conditionals2(20,20,false));
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
