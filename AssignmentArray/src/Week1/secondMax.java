package Week1;

import java.util.Scanner;

public class secondMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements");
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		max2(ar);

	}
	
	public static void max2(int n[]) {
		int maxN = n[0], max2N = n[0];
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] > max2N && n[i] < maxN) {
				max2N = n[i];
			}else if(n[i] > maxN) {
				max2N = maxN;
				maxN = n[i];
			}
		}
		
		System.out.println("Second max value of the arry is: "+max2N);
	}

}
