package string;
// if the reverse is equal to the string then the string is palindrome.
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
        
		String st = sc.nextLine();
		sc.close();
		
		System.out.println("The string is palindrome");
		
		System.out.println(isPalindrome(st));
		
	}
	
	public static boolean isPalindrome(String text) {
		
		if(text == null || text.isEmpty() ) {
			return true;
		}
		
		char[] array = text.toCharArray();
		StringBuilder sb = new StringBuilder(text.length());
		
		for(int i=text.length()-1; i>=0; i--) {
			sb.append(array[i]);
		}
		
		String reverse = sb.toString();
		return(text.equals(reverse));
	}

}
