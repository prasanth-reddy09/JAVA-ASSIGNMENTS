package com.arrays;

public class UnitMatrix {
	public static void main(String[] args) {
		int [][] a = {{1,0,0},
					  {0,1,0},
					  {0,0,1}
					 };
		
		
		boolean status = true;
		boolean result = true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i == j && a[i][j] != 1) {
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
			System.out.println("Unit Matrix");
		}
		else {
			System.out.println("Not Unit Matrix");
			
		}
		
	}
}
