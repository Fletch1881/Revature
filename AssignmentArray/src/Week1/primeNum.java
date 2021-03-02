package Week1;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		
		//1) Take an array input and find all the prime numbers from it
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements");
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i =0; i < n; i++) {
			if(isPrime(ar[i])) {
				System.out.println(ar[i]);
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
