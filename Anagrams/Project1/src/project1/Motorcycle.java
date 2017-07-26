package project1;

public class Motorcycle extends Vehicle {
	
	boolean hasGears;
	String motorbike;

	public Motorcycle(String make, String model, String colour, int maxSpeed, int yearRegistered, int mileage,
			boolean isAutomatic, boolean isInsured, double acceleration, boolean hasGears) {
		super(make, model, colour, maxSpeed, yearRegistered, mileage, isAutomatic, isInsured, acceleration);
		this.hasGears = hasGears;
	}
	
	public void motorcycleDetails()
	{
		System.out.println("----MOTORCYCLE----");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Colour: " + colour);
		System.out.println("Max speed: " + maxSpeed);
		System.out.println("Year registered: " + yearRegistered);
		System.out.println("Milage: " + mileage);
		System.out.println("Automatic?: " + isAutomatic);
		System.out.println("Insured?: " + isInsured);
		System.out.println("Acceleration Time (0-60): " + acceleration);
		System.out.println("Does the Motorcycle have gears?: " + hasGears);
		System.out.println("");
	}

	
	
	

}
