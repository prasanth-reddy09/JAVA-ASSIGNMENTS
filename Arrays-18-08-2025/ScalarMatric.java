package com.arrays;

public class ScalarMatric {
	public static void main(String[] args) {
		int [][] a = {{2,0,0},
					  {0,2,0},
					  {0,0,2}
					 };
		
		int temp = a[0][0]; 
		
		boolean status = true;
		boolean result = true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i == j && a[i][j] != temp) {
					status = false;
					break;
				}
				
				if(i!=j && a[i][j] != 0)
				{
					status = false;
					break;
				}
			}
			
			if(!status) {
				result = false;
			}
		}
		
		if(result) {
			System.out.println("Scalar Matrix");
		}
		else {
			System.out.println("Not Scalar Matrix");
			
		}
		
	}
}
