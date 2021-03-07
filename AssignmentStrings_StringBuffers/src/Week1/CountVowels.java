package Week1;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		//Take a string input from user and find the count of vowels(aeiouAEIOU) in it.

		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("Enter your word/sentence: ");
		s = sc.nextLine();
		
		System.out.println(s.replaceAll("[^aeiouAEIOU]", "").length());
		
	}

}
