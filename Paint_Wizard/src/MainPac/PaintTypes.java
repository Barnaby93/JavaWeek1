package MainPac;
import java.util.ArrayList;

public class PaintTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Products p1 = new Products("CheapoMax", 20, 19.99, 10);
		Products p2 = new Products("AverageJoes", 15, 17.99, 11);
		Products p3 = new Products("DuluxourousPaints", 10, 25, 20);
		
		ArrayList<Products> paints = new ArrayList<>();
		paints.add(p1);
		paints.add(p2);
		paints.add(p3);
		
		ArrayList<Integer> v1 = p1.wastesTheLeast(paints, 500);
		
				
		System.out.println(v1);

		int wtl=100000;
		for (int i=0; i<v1.size(); i++){
			if (v1.get(i)<=wtl)
			{
				wtl=v1.get(i);
			}
				
		
		}
		System.out.println(wtl);
		
		for (int i=0; i<v1.size(); i++){
			if (v1.get(i)==wtl){
				int index=i;
				System.out.println(paints.get(index).getName());
				
			}
			
			
			//
					
				
		}
	
	}

	
}



