package project1;

public class Lorry extends Vehicle {
	
	int size;

	public Lorry(String make, String model, String colour, int maxSpeed, int yearRegistered, int mileage,
			boolean isAutomatic, boolean isInsured, double acceleration, int size) {
		super(make, model, colour, maxSpeed, yearRegistered, mileage, isAutomatic, isInsured, acceleration);
		this.size = size;
	}
	
	public void lorryDetails()
	{		
	System.out.println("----LORRY----");
	System.out.println("Make: " + make);
	System.out.println("Model: " + model);
	System.out.println("Colour: " + colour);
	System.out.println("Max speed: " + maxSpeed);
	System.out.println("Year registered: " + yearRegistered);
	System.out.println("Milage: " + mileage);
	System.out.println("Automatic?: " + isAutomatic);
	System.out.println("Insured?: " + isInsured);
	System.out.println("Acceleration Time (0-60): " + acceleration);
	System.out.println("How many tonnes?: " + size);
	System.out.println("");
	}
	

}
