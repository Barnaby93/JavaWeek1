import java.util.ArrayList;

public class Attributes {
	
	private String Name;
	private String Occupation;
	private int Age;
	

		
		public Attributes (String Name, String Occupation, int Age) {
			super();
			this.Name = Name;
			this.Occupation = Occupation;
			this.Age = Age;
		}
		

		public String getName() {
			return Name;
		}



		public void setName(String name) {
			Name = name;
		}



		public String getOccupation() {
			return Occupation;
		}



		public void setOccupation(String occupation) {
			Occupation = occupation;
		}



		public int getAge() {
			return Age;
		}



		public void setAge(int age) {
			Age = age;
		}
		
		public String Method() {		
			return Name + ", " + Occupation + ", " +Age;			
		}

}
