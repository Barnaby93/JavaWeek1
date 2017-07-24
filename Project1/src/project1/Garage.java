package project1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Garage {

	public static void main(String[] args) {
		Car c = new Car("BMW", "3 Series", "White", 120, 2011, 47000, false, true, 5.4, false);
		Car d = new Car("Volkswagen", "Golf", "Black", 142, 2010, 65000, false, true, 6.8, false);
		
		//c.carDetails();
		//d.carDetails();
		
		Motorcycle m = new Motorcycle ("Harley Davidson", "x294", "Black", 147, 2014, 1200, true, true, 3.5, false);
		Motorcycle n = new Motorcycle ("Ducati", "v808", "Red", 109, 2009, 38012, true, true, 5.6, false);
		
		//m.motorcycleDetails();
		//n.motorcycleDetails();

		Lorry l = new Lorry ("Mercedes", "Wagon trailer", "Red", 80, 2015, 67852, false, true, 19.2, 20);
		Lorry o = new Lorry ("Yellow", "Fork lift", "Red", 86, 2014, 57852, false, true, 15.2, 15);
		
		//l.lorryDetails();
		//o.lorryDetails();
		
		Vehicle[] a = {c, d, m, n, l, o};
		List<Vehicle> garage = new ArrayList<Vehicle>();
		
		for (int i=0; i<a.length; i++)
		{
			garage.add(a[i]);
		}
		
		System.out.println("The makes of vehicles in stock at the moment:");
		for (int i = 0; i < garage.size(); i++)
		{
			System.out.println(garage.get(i).make);
		}
		
		for (int i=garage.size()-1; i>=0; i--)
		{
			garage.remove(i);
		}
		
		if (garage.isEmpty())
		{
			System.out.println("No more cars in garage!");
		}
		else 
		{
			for (int i=0; i<garage.size(); i++)
			{
				System.out.println();
			}
		}
		
		
	}

}
