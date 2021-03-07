package Week1;

public class Validator {

	
	public boolean isValidDL(String s){
		
		if(s.matches("[0-9]{8}") == false) {
			throw new BusinessExceptionDL("Invalid Drivers Liscence.");
		}
		
		return true;
	}
	
	public boolean isValidPP(String s) throws BusinessExceptionPP {
		
		if(!s.matches("[A-Z]{1}[0-9]{8}") || !s.matches("[0-9]{9}")) {
			throw new BusinessExceptionPP("Invalid PassPort Number");
		}
		
		return true;
	}
	
}
