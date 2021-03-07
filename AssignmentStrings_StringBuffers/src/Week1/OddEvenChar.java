package Week1;

import java.util.Scanner;

public class OddEvenChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String ar[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < ar.length; i++) {
			if(ar[i].length()%2 == 0) {
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}else {	
				int n = (ar[i].length()/2);
				sb.append(ar[i].substring(0,n)).append(Character.toUpperCase(ar[i].charAt(n))).append(ar[i].substring(n+1)).append(" ");
			}
		}
		System.out.println(sb.toString().trim());

	}

}
