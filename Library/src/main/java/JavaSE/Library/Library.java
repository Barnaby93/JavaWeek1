package JavaSE.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book("Barnaby Dickens", "The adventures of the curly wurly", 12.45, 1963, 14, true, 250, true);
		Book b1 = new Book("James B", "Photographer of life", 9.99, 2014, 7, false, 200, false);

		Dissertation d = new Dissertation("Jeff Nob", "How far?", 12.25, 1999, 20, false);
		Dissertation d1 = new Dissertation("Procopis", "Greek Food", 11, 2014, 18, false);

		govDocs g = new govDocs("Ned", "A tale of dwarfs", 13.99, 1983, 16, true);
		govDocs g1 = new govDocs("Jacob Nickles", "Was it now, or then?", 19.99, 1997, 28, false);

		User u = new User(123, "Barney1993", "113 Manchester ", 1612355652);
		User u1 = new User(1234, "Pro1993", "113 North London ", 2045845126);

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

		System.out.println("The books left in inventory are: ");

		for (Item i : inven.getInventory()) {
			System.out.println(i.getTitle() + ". Which cost: £" + i.getPrice());
		}

		/**inven.updatePrice(b1, 999.99);

		 for (Item i : inven.getInventory()) {
		 System.out.println("2: " + i.getPrice());
		 } **/

		System.out.println();

		for (Map.Entry<User, ArrayList<Item>> entry : inven.getCheckedOut().entrySet()) {
			System.out.println("\nUser: " + entry.getKey().getUserName());
			for (Item i : entry.getValue()) {
				System.out.println("\tItem: " + i.getTitle());
			}
		}
	}

}
