package Week1;

import java.util.Scanner;

public class PassPortValid {

	public static void main(String[] args) {
		//Write validation for passport number, SSN number, DL and any other ID if you have.
		
		Scanner sc = new Scanner(System.in);
		String ppn;
		Validator v = new Validator();
		
		System.out.println("Enter your PassPort Number: ");
		ppn= sc.nextLine();
		
		try {
			if(v.isValidPP(ppn)) {
				System.out.println("Valid PassPort");
			}
		}catch(BusinessExceptionPP e) {
			System.out.println(e.getMessage());
		}
		
		
		//Used before excpetions
		/*
		if(ppn.matches("[A-Z]{1}[0-9]{8}") || ppn.matches("[0-9]{9}")) {
			System.out.println("Valid PassPort");
		}else {
			System.out.println("Invalid PassPort");
		}*/
		
	}

}
