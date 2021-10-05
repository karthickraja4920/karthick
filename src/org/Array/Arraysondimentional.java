package org.Array;

public class Arraysondimentional {
	public static void main(String[] args) {
		// Data type Variable name [] = new data types [size];
	String a[]=new String[5];
	a[0]="ravi";
	a[1]="raja";
	a[2]="bala";
	a[3]="lokesh";
	
	System.out.println(a[1]);// raja
	//System.out.println(a[6]); //ArrayIndexOutOfBoundsException
	
	// to find the length
	int length = a.length;
    System.out.println(length);// 5
    //iterate array
    System.out.println("normal for loop");//normal for loop
    for (int i = 0; i < 4; i++) {
    	System.out.println(a[i]);//ravi ,raja ,bala,lokesh

		}
    System.out.println("enhanced for loop");//enhanced for loop 
    for (String x : a) {
    	System.out.println(x);
    	// won't create the duplicate array
    	//once we can fixed size can't modified 

    	String[] aa= {"SK","ss"};
    	System.out.println(aa[1]);
	}
	
	}
	
	
	}	

