package JavaSE.Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book(1, "Barnaby Dickens", "The adventures of the curly wurly", 12.45, 1963, 14, true, 250, true);
		Book b1 = new Book(2, "James B", "Photographer of life", 9.99, 2014, 7, false, 200, false);

		Dissertation d = new Dissertation(3, "Jeff Nob", "How far?", 12.25, 1999, 20, false);
		Dissertation d1 = new Dissertation(4, "Procopis", "Greek Food", 11, 2014, 18, false);

		govDocs g = new govDocs(5, "Ned", "A tale of dwarfs", 13.99, 1983, 16, true);
		govDocs g1 = new govDocs(6, "Jacob Nickles", "Was it now, or then?", 19.99, 1997, 28, false);

		User u = new User(123, "Barney1993", "113 Manchester ", 1612355652);
		User u1 = new User(1234, "Pro1993", "113 North London ", 2045845126);

		UserClass x = new UserClass();

		x.registerPerson(u);
		x.registerPerson(u1);

		System.out.println("The users registered are: ");
		for (User j : x.getUsers()) {
			System.out.println(j.getUserName());
		}

		System.out.println("");
		Inventory inven = new Inventory();
		inven.addItem(b);
		inven.addItem(b1);
		inven.addItem(d);
		inven.addItem(d1);
		inven.addItem(g);
		inven.addItem(g1);

		inven.checkOut(b1, u1);
		inven.checkOut(b, u);
		inven.checkOut(d1, u1);
		inven.checkOut(g1, u1);

		System.out.println("The Items title you have chosen to retrieve by ID is: " + inven.getItemByID(5).getTitle());
		System.out.println();

		System.out.println("The items left in inventory are: ");

		
//write to text file
		PrintWriter w;
		try {
			w = new PrintWriter("C:\\Users\\Administrator\\Desktop\\Attributes.txt", "UTF-8");
			for (Item i : inven.getInventory()) {
				String y = i.getTitle() + ". Which cost: £" + i.getPrice();
				System.out.println(i.getTitle() + ". Which cost: £" + i.getPrice());
				w.println(y);
				w.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * inven.updatePrice(b1, 999.99);
		 * 
		 * for (Item i : inven.getInventory()) { System.out.println("2: " +
		 * i.getPrice()); }
		 **/

		System.out.println();
		System.out.println("The Books that have been rented and by whom are: ");

		for (Map.Entry<User, ArrayList<Item>> entry : inven.getCheckedOut().entrySet()) {
			System.out.println("\nUser: " + entry.getKey().getUserName());
			for (Item i : entry.getValue()) {
				System.out.println("\tItem: " + i.getTitle());
			}
		}
		//read from text file
//		System.out.println();
//		try {
//			System.out.println("This text has been read from the text file: ");
//			System.out.println();
//			Scanner s = new Scanner (new File("C:\\Users\\Administrator\\Desktop\\Attributes.txt"));
//			while (s.hasNextLine()) {
//				String[] si=s.nextLine().split(", ");
//				
//				for (int i = 0; i < si.length; i++)
//				{
//					System.out.println(si[i]);
//				}
//				System.out.println("");
//				}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}{
//
//	}
	
	

		}
}
