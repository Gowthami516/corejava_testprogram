package tasks;

import java.util.Scanner;

public class ArrayLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = {12,45,7,89,23};
		
		int largestnum = a[0];
		
		for(int i = 1; i<a.length; i++) {
			if(a[i]>largestnum){
			largestnum = a[i];	
			}
		}
		System.out.println("largestnum =" +largestnum);
		sc.close();

	}

}
