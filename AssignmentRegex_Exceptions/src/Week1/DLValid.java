package Week1;

import java.util.Scanner;

public class DLValid {

	public static void main(String[] args) {
		//Write validation for passport number, SSN number, DL and any other ID if you have.
		
		Scanner sc = new Scanner(System.in);
		String dl;
		Validator v = new Validator();
		
		System.out.println("Enter your Drivers Liscence Number: ");
		dl= sc.nextLine();
		
		try {
			if(v.isValidDL(dl)) {
				System.out.println("Valid Drivers Liscnece");
			}
		}catch(BusinessExceptionDL e) {
			System.out.println(e.getMessage());
		}
		
		
		// Used before the excpetions were introduced
		/*
		if(dl.matches("[0-9]{8}")) {
			System.out.println("Valid Drivers Liscnece");
		}else {
			System.out.println("Invalid Drivers Liscence");
		}*/
		
		
	}

}
