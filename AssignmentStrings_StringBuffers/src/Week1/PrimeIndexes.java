package Week1;

import java.util.Scanner;

public class PrimeIndexes {

	public static void main(String[] args) {
		//Take a string input and print the characters at prime index to uppercase.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yoru sentence: ");
		String s = sc.nextLine();
		
		String b = s.toUpperCase();
		
		for(int i =0; i < b.length(); i++) {
			if(isPrime(i)) {
				System.out.print(b.charAt(i)+" ");
			}
		}
		
		
	}
	
	public static boolean isPrime(int n) {
		int c=0;
		for(int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
