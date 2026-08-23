package tasks;

import java.util.Scanner;

public class ArraySmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[]a = {12,45,7,89,23};
	
		
		int smallestnum = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallestnum) {
				smallestnum = a[i];
			}
			
		}
		System.out.println("smallestnum =" +smallestnum);
		sc.close();

	}

}
