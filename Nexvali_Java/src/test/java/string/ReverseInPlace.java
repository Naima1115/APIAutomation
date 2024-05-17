package string;

import java.util.Scanner;

public class ReverseInPlace {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		 
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		
		System.out.println("SinglyLinkedList string is:");
	    System.out.println(inPlaceReverse(st));

	}
	
	public static String inPlaceReverse(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		int length = sb.length();
		for(int i=0; i<length/2; i++) {
			
			char current = sb.charAt(i);
			int end = length-i-1;
			sb.setCharAt(i, sb.charAt(end));
			sb.setCharAt(end, current);
		}
		
		return sb.toString();
	}

}
