package Week1;

import java.util.Scanner;

public class MaxMinSentence {

	public static void main(String[] args) {
		// 3)Take a sentence as input and print the word with maximum letters and also print the word with minimum letters.
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String ar[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		String max = "", min = "abc";
		for(int i = 0; i < ar.length; i++) {
			if(ar[i].length() > max.length()) {
				max = ar[i];
			}else if(ar[i].length() < min.length()) {
				min = ar[i];
			}
		}
		System.out.println("Max letter: "+max);
		System.out.println("Min letter: "+min);

	}

}
