package tasks;

import java.util.Scanner;

public class ArrayReadandPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a elements:");
		int [] a = new int[5];
		
		for(int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
			
		}
		System.out.println("array elements");
		for(int i=0; i<a.length;i++) {
			System.out.print((a[i]+" "));
		}
		sc.close();
	}

}
