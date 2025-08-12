package com.DSA;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int[] a  = {23,0,5,0,4,6,7,0,0,2}; 
		
		int[] b = new int[a.length];
		
		int start = 0;
		int end = a.length-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != 0) {
				b[start++] = a[i];
			}
			else {
				b[end--] = a[i];
			}
		}
		
		
		
		System.out.println(Arrays.toString(b));
	}
}
