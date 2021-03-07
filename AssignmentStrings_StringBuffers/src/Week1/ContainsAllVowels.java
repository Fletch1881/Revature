package Week1;

import java.util.Scanner;

public class ContainsAllVowels {

	public static void main(String[] args) {
		
		//Take a string input and print true if all vowels are present in it else print false.  aHedafioullooo - true aHedafiollooo - false
		Scanner sc = new Scanner(System.in);
		String s;
				
		
		System.out.println("Enter your word: ");
		s = sc.nextLine();
		
		int actual = 5;
		int count = 0;
		
		if(s.contains("a")) {
			count++;
		}
		if(s.contains("e")) {
			count++;
		}
		if(s.contains("i")) {
			count++;
		}
		if(s.contains("o")) {
			count++;
		}
		if(s.contains("u")) {
			count++;
		}
			
		if(actual == count) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
		
	}

}
