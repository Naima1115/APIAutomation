package string;

import java.util.Arrays;
import java.util.Scanner;

// check weather two string is anagram to each other.
//two strings are anagram if they contain the same character but in different order.

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println("Enter two string");
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		sc.close();
		
		System.out.println("The two strings are anagram");
		System.out.println(isAnagram(st1, st2));

	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return Arrays.equals(array1, array2);
		
	}

}
