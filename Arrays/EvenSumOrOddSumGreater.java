package com.arrays;

public class EvenSumOrOddSumGreater {


	public static void main(String[] args) {
		int[] arr = {2,7,3,1,8,24,9,15};
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int element : arr) {
			if(element%2 == 0) {
				evenSum += element;
			}
			else {
				oddSum += element;
			}
		}
		
		if(evenSum == oddSum) {
			System.out.println("EvenSum is Equal to OddSum");
		}
		else if(evenSum > oddSum ) {
			System.out.println("EvenSum is Greater than OddSum");
		}
		else {
			System.out.println("OddSum is Greater than EvenSum");
		}
		
	}


}


