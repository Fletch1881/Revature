package Week1;

import java.util.Scanner;

public class PassPortValid {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		String ppn;
		
		System.out.println("Enter your PassPort Number: ");
		ppn= sc.nextLine();
		
		if(ppn.matches("[A-Z]{1}[0-9]{8}") || ppn.matches("[0-9]{9}")) {
			System.out.println("Valid PassPort");
		}else {
			System.out.println("Invalid PassPort");
		}
		
	}

}
