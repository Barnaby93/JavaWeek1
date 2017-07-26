package JavaSE.Anagrams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramClass {

	ArrayList<String> readFile = new ArrayList<String>();
	HashMap<String, ArrayList<String>> mostAnagrams = new HashMap<String, ArrayList<String>>();
	int max = 0;
	int length = 0;
	String AA = null;
	ArrayList<String> saveWords = new ArrayList<String>();

	long startTime;
	long endTime;

	public AnagramClass() {

	}

	public void startTime() {
		startTime = System.currentTimeMillis();
	}

	public void endTime() {
		endTime = System.currentTimeMillis();
	}

	public void timeTaken() {
		System.out.println("Total execution time: " + ((double) (endTime - startTime) / 1000) + " seconds");
	}

	public void readFile() {
		try {
			Scanner s = new Scanner(new File("C:\\Users\\Administrator\\Desktop\\Test.txt"));

			while (s.hasNextLine()) {
				String[] wordList = s.nextLine().split(", ");

				for (int i = 0; i < wordList.length; i++) {
					readFile.add(wordList[i]);
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void arrangeAnagram() {
		for (int i = 0; i < readFile.size(); i++) {
			String word = readFile.get(i);
			char[] chars = word.replaceAll("\\s+", "").toLowerCase().toCharArray();
			Arrays.sort(chars);
			String alphabeticalOrder = String.valueOf(chars);
			if (mostAnagrams.containsKey(alphabeticalOrder)) {
				mostAnagrams.get(alphabeticalOrder).add(word);

			} else {
				ArrayList<String> newArray = new ArrayList<String>();
				newArray.add(word);
				mostAnagrams.put(alphabeticalOrder, newArray);
			}
		}
	}

	public void largestAnagram() {
		for (Map.Entry<String, ArrayList<String>> entry : mostAnagrams.entrySet()) {
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();

			if (value.size() > max) {
				saveWords.clear();
				max = value.size();
				AA = key;
				saveWords.add(AA);
			} else if (value.size() == max) {
				AA = key;
				saveWords.add(AA);
			}

		}
		System.out.println("The largest anagram/s are: " + "'" + saveWords + "'" + " with: " + max + " variations.");
	}

	public void anagramLength() {
		if (saveWords.size() > 1) {
			int max = 0;
			for (String s : saveWords) {
				if (s.length() > max) {
					max = s.length();
				}
			}

			for (String s : saveWords) {
				if (s.length() == max) {
					System.out.println("There is more than one combinations with the same amount of annagrams, however, " + "'" +s+"'"+" has the most amount of characters." );
				}
			}
		}

	}
}
