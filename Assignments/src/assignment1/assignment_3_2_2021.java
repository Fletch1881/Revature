package assignment1;

public class assignment_3_2_2021 {
	
	public static void main(String[] args) {
		
		System.out.println("1) All the loops (while, for, do-while\n");
		myLoops();
		
		System.out.println("\n2) All palindromes from 100-999\n");
		palindromes();

		
		System.out.println("\n3) All odd numbers from 100-199\n");
		oddNumbers();
		
		System.out.println("\n4) All even sum and odd sum between 1-100\n");
		evenOddSum();

	}
	
	public static void myLoops() {	// 1) Try all the loops by yourself with some use case of your own
		for(int i = 0; i <= 3; i++) {
			System.out.println("This is my for loop!");
		}
		
		int x = 18;
		while(x > 13) {
			System.out.println("While loop here!");
			--x;
		}
		
		do {
			System.out.println("Do While loop is coming through!");
			x++;
		}while(x!= 18);
	}
	
	public static void palindromes() {
		for(int i = 100; i <= 999; i++) {
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
	
	public static void oddNumbers() { // 3) Find all the odd number between 100 and 199
		for(int i = 100; i <=199; i++) {
			if(i%2 != 0) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static void evenOddSum() {	// 4)Find the sum of all even numbers between 1 and 100, also find the sum of all odd numbers between 1 and 100 and print the results and print which is largest among them(between even sum and odd sum)
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
