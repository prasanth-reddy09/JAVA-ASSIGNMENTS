package com.arrays;

import java.util.Arrays;

public class Intersection {
	public static void main(String[] args) {
		int[] a = {1,2,5,4,3,7};
		int[] b = {3,1,8,9,2,6};
		int[] c = new int[a.length];
		
		int l = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j])
				{
					c[l++] = a[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
}
