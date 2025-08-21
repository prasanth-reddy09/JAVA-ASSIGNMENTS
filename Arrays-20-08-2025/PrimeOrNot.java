package com.arrays;

import java.util.Arrays;

public class PrimeOrNot {
	public static void main(String[] args) {
		int[] arr = {23, 21,17,11,22,56,50};
		
		boolean[] result = new boolean[arr.length];
		
		
		for(int i=0;i<arr.length;i++) {
			
			result[i] = primeCheck(arr[i]);
		}
		
		
		System.out.println(Arrays.toString(result));
		
		
	}
	
	public static boolean primeCheck(int num) {
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
