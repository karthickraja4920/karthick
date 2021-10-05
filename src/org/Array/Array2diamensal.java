package org.Array;

public class Array2diamensal {
	public static void main(String[] args) {
		
	//datatypes  variable[][] = new datatypes[][];
	float a[][]= new float [2][4];
	a[0][0]=0.1f;
	a[0][1]=0.2f;
	a[0][2]=0.3f;
	a[0][3]=0.4f;
	a[1][0]=0.5f;
	a[1][1]=0.6f;
	a[1][2]=0.7f;
	a[1][3]=0.8f;
	System.out.println(a[0][1]);//0.2

	// iterate for the array
	System.out.println("normal for loop");//normal for loop
	      for (int i = 0; i < 2; i++) {
		  for (int j = 0; j <4; j++) {
			 System.out.println(a[i][j]);// 0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8
}
	      }
		System.out.println("**************");
		System.out.println("enhanced for loop");// enhanced for loop
		
		for (float[] fx : a) {
			for (float fy :fx) {
				System.out.println(fy);
			}
			
		}
		}
	}
		
		
	
	
	
	
	


