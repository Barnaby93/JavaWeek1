package project1;

public class Car extends Vehicle {
	
	boolean isConvertible;

	public Car(String make, String model, String colour, int maxSpeed, int yearRegistered, int mileage,
			boolean isAutomatic, boolean isInsured, double acceleration, boolean isConvertible) {
		super(make, model, colour, maxSpeed, yearRegistered, mileage, isAutomatic, isInsured, acceleration);
		this.isConvertible = isConvertible;
	}
	
	public void carDetails()
	{
		System.out.println("----CAR----");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Colour: " + colour);
		System.out.println("Max speed: " + maxSpeed);
		System.out.println("Year registered: " + yearRegistered);
		System.out.println("Milage: " + mileage);
		System.out.println("Automatic?: " + isAutomatic);
		System.out.println("Insured?: " + isInsured);
		System.out.println("Acceleration Time: (0-60) " + acceleration);
		System.out.println("Is the car a convertible?: " + isConvertible);
		System.out.println("");
	}
	

}
