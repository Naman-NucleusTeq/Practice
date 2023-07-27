package array;

import java.util.*;
public class ReverseArray {
	
	public static int[] reverse(int[] arr) {
		int size = arr.length;
		int[] reverse = new int[size];
		
		for(int i=0, j = size-1; i<size; i++,j--) {
			reverse[i] = arr[j];
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array -");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the selements of array -");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] rev = reverse(arr);
		System.out.println("Reverse = " + Arrays.toString(rev));
		sc.close();
	}

}
