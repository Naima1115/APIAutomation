package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		System.out.println("The reverse sentence is:");
		System.out.println(reverseWord(st));

	}
	
	public static String reverseWord(String sentence) {
		
		List<String> words = Arrays.asList(sentence.split("//s"));
		Collections.reverse(words);
		
		StringBuilder sb = new StringBuilder(sentence.length());
		for(int i=words.size()-1; i>=0; i--) {
			sb.append(words.get(i));
			sb.append(' ');
		}
		return sb.toString().trim();
	}

}
