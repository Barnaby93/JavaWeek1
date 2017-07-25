package JavaSE.Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Inventory {
	private HashMap<User, ArrayList<Item>> checkedOut;
	private ArrayList<Item> items;

	public Inventory() {
		checkedOut = new HashMap<>();
		items = new ArrayList<Item>();
	}

	public void checkOut(Item i, User u) {
		if (items.contains(i)) {
			items.remove(i);
			if (checkedOut.containsKey(u)) {
				checkedOut.get(u).add(i);
			} else {
				checkedOut.put(u, new ArrayList<>(Arrays.asList(i)));
			}
		}
	}

	public void checkIn(Item i, User u) {
		if (checkedOut.containsKey(u) && checkedOut.get(u).contains(i)) {
			checkedOut.get(u).remove(i);
			items.add(i);

			if (checkedOut.get(u).isEmpty()) {
				checkedOut.remove(u, new ArrayList<>());
			}
		} else if (checkedOut.isEmpty()) {
			addItem(i);
		}
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public void removeItem(Item i) {
		items.remove(i);
	}

	public ArrayList<Item> getInventory() {
		return items;
	}

	public HashMap<User, ArrayList<Item>> getCheckedOut() {
		return checkedOut;
	}

	public void updatePrice(Item i, double price) {
		if (items.contains(i)) {
			i.setPrice(price);
		}
	}

	public void updateDuration() {

	}
}
