package Week1;

import java.util.Scanner;

public class oddNumAssignment {

	public static void main(String[] args) {
		// 3) Find all the odd number between 100 and 199
		/*
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
				oddNumbers(num1, num2);
			}else {
				oddNumbers(num2, num1);
			}
		}else {
			oddNumbers();  
		}
		*/
		
		oddNumbers();
	}

	
	public static void oddNumbers() { // 3) Find all the odd number between 100 and 199
		for(int i = 100; i <=199; i++) {
			if(i%2 != 0) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static void oddNumbers(int num1, int num2) { // 3) Find all the odd number between 100 and 199
		for(int i = num1; i <= num2; i++) {
			if(i%2 != 0) {
				System.out.println(i+" ");
			}
		}
	}
	
}
