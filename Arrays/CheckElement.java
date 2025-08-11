package com.arrays;

public class CheckElement {
	public static void main(String[] args) {
		int target = 10;
		int[] arr = {12,54,23,76,10,43,65};
		
		boolean isTargetFound = false;
		
		for(int elem : arr) {
			if(target == elem) {
				isTargetFound = true;
				break;
			}
		}
		
		if(isTargetFound) {
			System.out.println("Target found");
		}
		else {
			System.out.println("Target not Found");
		}
	}
}
