package Week1;

public class oddNumAssignment {

	public static void main(String[] args) {
		// 3) Find all the odd number between 100 and 199
		oddNumbers();
	}

	
	public static void oddNumbers() { // 3) Find all the odd number between 100 and 199
		for(int i = 100; i <=199; i++) {
			if(i%2 != 0) {
				System.out.println(i+" ");
			}
		}
	}
	
	
}
