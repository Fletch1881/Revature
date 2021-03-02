package Week1;

import java.util.Arrays;

public class crudArray {

	public static void main(String[] args) {
		// 6) Perform CRUD operations on Array
		int ar[] = new int[8];
		
		System.out.println("Creating blank arary: ");
		System.out.println(Arrays.toString(ar));
		
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = 18;
		}
		System.out.println("\nFilling in array with '18' in all slots: ");
		System.out.println(Arrays.toString(ar));
		
		
		int ele = 24;
		int pos = 5;
		ar[pos-1] = ele;
		System.out.println("\nUpdating the array with a new number at position 5: ");
		System.out.println(Arrays.toString(ar));
		
		int n = ar.length-1; // Decrementing the length by one to make the array in bounds still
		int delpos = 4;
		for(int i = delpos-1; i < n; i++) {
			ar[i] = ar[i+1];
		}
		System.out.println("\nDeleting the element at the fourth position: ");
		for(int i = 0; i < n; i++) {		// Better for printing out the array after I "delete" an element
			System.out.print(ar[i]+" ");
		}
		//System.out.println(Arrays.toString(ar));	// This prints out all of the elements regardless if I "deleted" one or not.
		

	}

}
