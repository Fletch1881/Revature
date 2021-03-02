package Week1;

import java.util.Scanner;

public class palindromeAssingment {

	public static void main(String[] args) {
		// 2) Print all the palindrome numbers between 100 and 999
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the smaller number: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the larger number: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(num1 < num2) {
			palindromes(num1, num2);
		}else {
			palindromes(num2, num1);
		}
		

	}
	
	public static void palindromes(int num1, int num2) {
		for(int i = num1; i <= num2; i++) {
			int temp = 0, reverse = 0, newI = i;
			while(newI>0) {
				temp = newI%10;
				reverse = reverse * 10 + temp;
				newI = newI/10;
			}
			if(i == reverse) {
				System.out.println(i+" is a palindrome");
			}
		}
	}

}
