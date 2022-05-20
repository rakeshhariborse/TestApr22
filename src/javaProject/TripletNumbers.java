package javaProject;

import java.util.Arrays;

public class TripletNumbers {

	void getTripletNumbers(int[] arr){
		int sumOfTriplets = 0;
		int sumOfThreeNumbers = 0;
		System.out.println("Input array = " + Arrays.toString(arr));
		System.out.println("Triplets = ");
		for (int index =0; index<arr.length-2; index++) {
			sumOfTriplets = 3*(arr[index]+1);
			sumOfThreeNumbers = arr[index] + arr[index+1] + arr[index+2];
			if (sumOfTriplets == sumOfThreeNumbers)
				System.out.println("   " + Integer.toString(arr[index]) + ", " +
						Integer.toString(arr[index+1]) +  ", " +
						Integer.toString(arr[index+2]));		
		}
	}
	
	public static void main(String[] args) {
		TripletNumbers TripletNumbers = new TripletNumbers();
		int[] inputArray = {11,12,13,45,56,57,58,34,23,24,69};
		TripletNumbers.getTripletNumbers(inputArray);
	}
}
