package project1;

public abstract class Vehicle {
	
	String make;
	String model;
	String colour;
	
	
	int maxSpeed;
	int yearRegistered;
	int mileage;
	
	
	boolean isAutomatic;
	boolean isInsured;
	
	double acceleration;

	public Vehicle(String make, String model, String colour, int maxSpeed, int yearRegistered, int mileage,
			boolean isAutomatic, boolean isInsured, double acceleration) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		this.yearRegistered = yearRegistered;
		this.mileage = mileage;
		this.isAutomatic = isAutomatic;
		this.isInsured = isInsured;
		this.acceleration = acceleration;
		
		
	}
	
	

}
