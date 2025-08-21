package com.arrays;

import java.util.Arrays;

public class MatrixMultiplication {
		public static void main(String[] args) {
			int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
			int[][] b = {{3,2,1},{6,5,4},{9,8,7}};
			
			
			int[][] c = new int[a.length][b[0].length];
			
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					for(int k=0;k<a[0].length;k++) {
					c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			
			
			for(int[] arr : c) {
				System.out.println(Arrays.toString(arr));
			}
		}
}
