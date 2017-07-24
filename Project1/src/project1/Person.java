package project1;

public class Person {
	
		String name;
		int age;
		String jobTitle;
	
		public String details()
		{
			return name + age + jobTitle;
		}

	public Person (String a, int b, String c)
	{
		name = a;
		age = b;
		jobTitle = c;
		
	}

}
