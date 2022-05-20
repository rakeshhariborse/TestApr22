/* Missing numbers using less complexity wrt 2 for loops.
*/

package javaProject;

import java.util.Arrays;

public class MissingNumbers {

	boolean isValidRange(int[] arr, int startR, int endR) {
		if (startR>arr[0] || endR<arr[arr.length-1]) {
			System.out.println("Invalid range wrt input array");
			return false;
		}
		return true;
	}
		
	void missingNumbers(int[] arr, int startR, int endR) {
		System.out.println("Missing numbers for input array = " + Arrays.toString(arr) + " and range from " + startR + " to " + endR );
		if (isValidRange(arr, startR, endR)) {
			int count = 0;                      // current found missing numbers
			int mn = endR-startR-arr.length+1;  //total missing numbers		
			//missing numbers before input array's first element
			if(startR != arr[0]) {
				for(int index=startR; index<arr[0]; index++) {
					System.out.print((index) + ", ");
					count++;
				}
			}	
			//missing numbers within the range of input array
			for (int index=0; index < arr.length-1 && count<mn; index++) {
				int diff = arr[index+1]-arr[index];
				if (diff>1) {
					for (int increment = 1; increment <diff; increment++) {
						System.out.print((arr[index]+increment) + ", ");
						count++;
					}
				}				
			}
			//missing numbers beyond input array's last element
			if(count<mn) {
				for(int index=1; index<=mn-count; index++)
					System.out.print((arr[arr.length-1]+index) + ", ");
			}
		}
		System.out.println(""); System.out.println("");
	}
	
	public static void main(String[] args) {
		MissingNumbers missingNumbers = new MissingNumbers();
		missingNumbers.missingNumbers(new int[] {5,7,10}, 3, 12);
		missingNumbers.missingNumbers(new int[] {1,2,3}, 1, 5);
		missingNumbers.missingNumbers(new int[] {5,6,7}, 6, 10);
		missingNumbers.missingNumbers(new int[] {5,6,7}, 1, 6);
		missingNumbers.missingNumbers(new int[] {1,2,3}, -2, 3);
	}
}