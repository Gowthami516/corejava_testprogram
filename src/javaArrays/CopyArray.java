package javaArrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
	System.out.println("main method started");
	int[] a1= {3,4,5};
	int[] a2 = {6,7,8};
	
	int[] a3 = new int[a1.length+a2.length];
	
	for (int i =0; i<a1.length; i++) {
		a3 [i] = a1[i];
	}
	for(int i=0; i<a2.length; i++) {
		a3[a1.length+i] = a2[i];
	}
	System.out.println(Arrays.toString(a3));
	
	}

}
