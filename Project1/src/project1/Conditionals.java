package project1;

public class Conditionals {

	public static void main(String[] args) 
	{
		System.out.println(AdditionTwo(10,20,true));
	}
	
	static int AdditionTwo(int a, int b, boolean c)
	{
		
		if (c == false)
		{
			return a*b;
		}
		else 
		{
			return a+b;
		}

}
}
