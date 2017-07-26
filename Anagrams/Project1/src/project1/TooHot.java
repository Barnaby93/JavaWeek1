package project1;

public class TooHot {

	public static void main(String[] args) 
	{
		System.out.println(tooHot(80,false));	

	}
	
	static boolean tooHot(int T, boolean isSummer)
	{
		if (isSummer)
			if ((T>=60) && (T<=100))
			{
				return true;
			}
			else 
			{
				return false;
			}
		else 
			if (T>=60 && T<90)
			{
				return true;
			}
			else 
			{
				return false;
			}
		
	}

}
