package Week1;

import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// 4) Take an array input and find the max values and min value from that array.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements");
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		minMaxVal(ar);

	}
	
	public static void minMaxVal(int n[]) {
		int maxN = n[0], minN = n[0];
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] < minN) {
				minN = n[i];
			}else if(n[i] > maxN) {
				maxN = n[i];
			}
		}
		
		System.out.println("Max value of the arry is: "+maxN);
		System.out.println("Min value of the array is: "+minN);
	}

}
