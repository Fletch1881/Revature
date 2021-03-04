package Week1;

import java.util.Scanner;

public class palindromeArray {

	public static void main(String[] args) {
		// 2) Take an array input and find all the palindrone numbers from it
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements");
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		palindromes(ar);

	}
	
	public static void palindromes(int n[]) {
		for(int i = 0; i < n.length; i++) {
			int temp = 0, reverse = 0, newI = n[i];
			while(newI>0) {
				temp = newI % 10;	
				reverse = reverse * 10 + temp; 
				newI = newI / 10; 
			}
			if(n[i] == reverse) {
				System.out.println(n[i]+" is a palindrome");
			}
		}
	}

}
