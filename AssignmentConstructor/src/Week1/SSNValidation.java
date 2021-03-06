package Week1;

import java.util.Scanner;

public class SSNValidation {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String ssn;
		
		
		System.out.println("Enter your Social Security Number: ");
		ssn = sc.nextLine();
		
		if(ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("Valid SSN");
		}else {
			System.out.println("Invalid SSN");
		}
				
		
	}
	


}
