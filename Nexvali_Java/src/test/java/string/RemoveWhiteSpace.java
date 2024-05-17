package string;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		
		System.out.println("After removing white space");
		System.out.println(st.replaceAll(" ",""));
	}

}
