package MainPac;
import java.util.ArrayList;

public class Products {
	
	private String name;
	private int litres;
	double price;
	private int metersPerLitre;
	private ArrayList<Products> paints;
	
	
	public Products(String name, int litres, double price, int metersPerLitre) {
		super();
		this.name = name;
		this.litres = litres;
		this.price = price;
		this.metersPerLitre = metersPerLitre;
	}
	
	public ArrayList<Integer> wastesTheLeast(ArrayList<Products> paints, int areaToPaint)
	{
		int value = 0;
		ArrayList<Integer> vals = new ArrayList<>();
		
		for (Products p : paints) {
			int totalPerTin, left = areaToPaint, tinAmt = 0;
			totalPerTin = p.getLiters() * p.getMetersPerLitre();
			while (left > 0)
			{
				tinAmt++;
				left = left - totalPerTin;
			}
			value = tinAmt * totalPerTin;
			value = (areaToPaint - value);
			value = (value * -1);
			vals.add(value);
		}
		return vals;
	}
	
	public int getLiters() {
		return litres;
	}
	
	public int getMetersPerLitre() {
		return metersPerLitre;
	}
	
	public String getName() {
		return name;
	}
	
	
	}
	
	
	



