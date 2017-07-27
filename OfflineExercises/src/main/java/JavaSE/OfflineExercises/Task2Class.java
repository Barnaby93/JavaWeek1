package JavaSE.OfflineExercises;

public class Task2Class {
	boolean twoPiecesOfBread;
	boolean somethingInBetween;
	String filling = "ham";
	
	public Task2Class(boolean twoPiecesOfBread, boolean somethingInBetween) {
		super();
		this.twoPiecesOfBread = twoPiecesOfBread;
		this.somethingInBetween = somethingInBetween;
	}	
	
	public void getSandwich() {
		if (twoPiecesOfBread == true && somethingInBetween == true) {
			System.out.println(filling);
		}
		else {
			System.out.println("No sandwich");
		}
		
		
	}
		
	}

