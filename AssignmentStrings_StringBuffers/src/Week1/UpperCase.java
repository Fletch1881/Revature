package Week1;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yoru sentence: ");
		String s = sc.nextLine();
		
		String ar[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < ar.length; i++) {
			int last = ar[i].length();
			sb.append(ar[i].substring(0,last-1)).append(Character.toUpperCase(ar[i].charAt(last-1))).append(" ");
		}
		
		System.out.println(sb.toString());
		
		

	}

}
