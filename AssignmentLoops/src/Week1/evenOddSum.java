package Week1;

import java.util.Scanner;

public class evenOddSum {

	public static void main(String[] args) {
		// 4)Find the sum of all even numbers between 1 and 100, also find the sum of all odd numbers between 1 and 100 and print the results 
		//		and print which is largest among them(between even sum and odd sum)
		
		Scanner sc = new Scanner(System.in);
		String ans;
		
		System.out.println("Do you want to input numbers? (y/n)");
		ans= sc.nextLine();
		
		if(ans.equals("y")) {
			System.out.println("Enter the smaller number: ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the larger number: ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			if(num1 < num2) {
				evenOddSum(num1, num2);
			}else {
				evenOddSum(num2, num1);
			}
		}else {
			evenOddSum();  
		}
		
		//evenOddSum(); // actual assingment from 1-100
	}

	
	public static void evenOddSum(int num1, int num2) {	 // overloaded function to get nums in if wanted
		int evenSum = 0, oddSum = 0;
		
		for(int i = num1; i <= num2; i++) {
			if(i%2 == 0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		
		System.out.println("Even Sum is : " + evenSum);
		System.out.println("Odd Sum is : "+ oddSum);
		
		if(evenSum > oddSum) {
			System.out.println("The largest sum is Even Sum: "+ evenSum);
		}else {
			System.out.println("The largest sum is Odd Sum: "+ oddSum);
		}
		
	}
	
	public static void evenOddSum() {	
		int evenSum = 0, oddSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		
		System.out.println("Even Sum is : " + evenSum);
		System.out.println("Odd Sum is : "+ oddSum);
		
		if(evenSum > oddSum) {
			System.out.println("The largest sum is Even Sum: "+ evenSum);
		}else {
			System.out.println("The largest sum is Odd Sum: "+ oddSum);
		}
		
	}
}
