package com.arrays;

public class EvenSumOddSum {
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
		
		System.out.println("EvenSum :" + evenSum);
		System.out.println("OddSum : "+oddSum);
	}
}
