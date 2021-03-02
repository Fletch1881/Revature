package Week1;

public class evenOddSum {

	public static void main(String[] args) {
		// 4)Find the sum of all even numbers between 1 and 100, also find the sum of all odd numbers between 1 and 100 and print the results 
		//		and print which is largest among them(between even sum and odd sum)
		
		evenOddSum();
	}

	
	public static void evenOddSum() {	
		int evenSum = 0, oddSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		
		System.out.println("Even Sum is : " + evenSum);
		System.out.println("Odd Sum is : "+ oddSum);
		
		if(evenSum > oddSum) {
			System.out.println("The largest sum is Even Sum: "+ evenSum);
		}else {
			System.out.println("The largest sum is Odd Sum: "+ oddSum);
		}
		
	}
}
