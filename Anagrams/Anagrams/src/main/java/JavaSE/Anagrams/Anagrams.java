package JavaSE.Anagrams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		AnagramClass a = new AnagramClass();

		a.startTime();

		a.readFile();

		a.arrangeAnagram();

		a.largestAnagram();
		
		a.anagramLength();

		a.endTime();

		a.timeTaken();

	}
}
