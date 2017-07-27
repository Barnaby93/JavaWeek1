import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Attributes a1 = new Attributes("Barney", "Consultant", 23);
		Attributes a2 = new Attributes("Jack", "Builder", 27);
		Attributes a3 = new Attributes("Henry", "Pilot", 29);
		Attributes a4 = new Attributes("Harry", "Climber", 20);
		Attributes a5 = new Attributes("Phil", "Inventor", 21);

		ArrayList<Attributes> People = new ArrayList<>();
		People.add(a1);
		People.add(a2);
		People.add(a3);
		People.add(a4);
		People.add(a5);
//writefile
		try {
			PrintWriter w = new PrintWriter("C:\\Users\\Administrator\\Desktop\\Attributes.txt", "UTF-8");

			for (int i = 1; i < People.size(); i++) {
				Attributes x = People.get(i);
				System.out.println(x.Method());
				w.println(x.Method());
				System.out.println("");
			}
			w.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		readfile
//			try {
//				Scanner s = new Scanner (new File("C:\\Users\\Administrator\\Desktop\\Attributes.txt"));
//				ArrayList<Attributes> readFile = new ArrayList<Attributes>();
//				
//				while (s.hasNextLine()) {
//					String[] si=s.nextLine().split(", ");
//					
//					for (int i = 0; i < si.length; i++)
//					{
//						System.out.println(si[i]);
//					}
//					System.out.println("");
//					int n = Integer.parseInt(si[2]);
//					Attributes fileRead = new Attributes (si[0],si[1],n);
//					readFile.add(fileRead);
//				}
//				
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
		

	}

}
