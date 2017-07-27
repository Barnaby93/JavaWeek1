package JavaSE.OfflineExercises;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		int n;
		
		word = "chocolateerwkgeiokrogijer";
		n = 4;
		
		int wordLength;
		wordLength = word.length();
		
		
		for (int i =0; i < n; i ++) {
			System.out.println(word.charAt((i)));
		} 
		
		for (int i = (wordLength -1); i > ((wordLength -1) - n); i--){
				System.out.println(word.charAt((i)));
			}
			
		


	}

}

