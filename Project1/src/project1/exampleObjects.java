package project1;

public class exampleObjects {
	public static void main(String[] args) {
		
	
	Person p1 = new Person ("Barney ", 23, " Trainee Consultant");
	Person p2 = new Person ("Seamus ", 24, " Trainee Consultant2");
	Person p3 = new Person ("Alfred ", 57, " Butler");
	
	Person[] Array = {p1, p2, p3};
	
	for (int i = 0; i < Array.length; i++)
	{
		System.out.println(Array[i].details());
	}


}
}

