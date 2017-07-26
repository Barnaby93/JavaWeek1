package Testing;
import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

import MainPac.Products;

public class PaintTypesTest {
	
	Products p1 = new Products("CheapoMax", 20, 19.99, 10);
	Products p2 = new Products("AverageJoes", 15, 17.99, 11);
	Products p3 = new Products("DuluxourousPaints", 10, 25, 20);
	
	
	@Test
	public void test() {
		
		ArrayList<Products> paints = new ArrayList<>();
		paints.add(p1);
		paints.add(p2);
		paints.add(p3);

		ArrayList<Integer> v1 = p1.wastesTheLeast(paints, 500);
		
		assertEquals((int) 100,(int) v1.get(0));
		assertEquals((int) 160,(int) v1.get(1));
		assertEquals((int) 100,(int) v1.get(2));


		
	}

}
