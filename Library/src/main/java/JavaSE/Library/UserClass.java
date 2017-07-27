package JavaSE.Library;

import java.util.ArrayList;

public class UserClass {

	private ArrayList<User> user;
	
	public UserClass() {
		user = new ArrayList<User>();
	}

	public ArrayList<User> getUsers() {
		return user;
	}
	
	public void registerPerson(User u) {
		user.add(u);
	}
	
	public void deletePerson(User u) {
		user.remove(u);
	}
	
	public void updatePerson() {
		
	}
	//updatePerson
}
