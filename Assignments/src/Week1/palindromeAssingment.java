package Week1;

public class palindromeAssingment {

	public static void main(String[] args) {
		// 2) Print all the palindrome numbers between 100 and 999
		palindromes();

	}
	
	public static void palindromes() {
		for(int i = 100; i <= 999; i++) {
			int temp = 0, reverse = 0, newI = i;
			while(newI>0) {
				temp = newI%10;
				reverse = reverse * 10 + temp;
				newI = newI/10;
			}
			if(i == reverse) {
				System.out.println(i+" is a palindrome");
			}
		}
	}

}
