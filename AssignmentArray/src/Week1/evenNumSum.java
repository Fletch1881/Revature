package Week1;

import java.util.Scanner;

public class evenNumSum {

	public static void main(String[] args) {
		// 3) Take an array input and find the sum of all even numbers from it
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements");
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		evenSum(ar);
	}
	
	public static void evenSum(int n[]) {
		int evenSum = 0;
		
		for(int i = 0; i < n.length; i++) {
			if(n[i]%2 == 0) {
				evenSum+=n[i];
			}
		}
		
		System.out.println("Even Sum is : " + evenSum);
	}

}
