package Week1;

public class BusinessExceptionDL extends RuntimeException{
	//Create a Business Exception(unchecked) and use it for handing invalid DL number
	
	public BusinessExceptionDL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessExceptionDL(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
