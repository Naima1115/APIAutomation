package string;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		
		reverseString(st);

	}
	
	public static void reverseString(String text) {
		
		char[] array = text.toCharArray();
		StringBuffer sb = new StringBuffer(text.length());
		
		for(int i = text.length()-1; i>=0; i--) {
			
			sb.append(array[i]);
			
		}
		
		String reverse = sb.toString();
		System.out.println("SinglyLinkedList string is:" + reverse);
		
	}

}
