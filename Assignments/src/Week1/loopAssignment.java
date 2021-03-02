package Week1;

public class loopAssignment {

	public static void main(String[] args) {
		// 1) Try all the loops by yourself with some use case of your own
		myLoops();
	}

	public static void myLoops() {	
		for(int i = 0; i <= 3; i++) {
			System.out.println("This is my for loop!");
		}
		
		int x = 18;
		while(x > 13) {
			System.out.println("While loop here!");
			--x;
		}
		
		do {
			System.out.println("Do While loop is coming through!");
			x++;
		}while(x!= 18);
	}
	
}
