package tasks;

import java.util.Scanner;

public class ArrayAvgOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		 int sum = 0;
		 
		 System.out.println("enter 4 numbers:");
		 for(int i = 0; i<a.length; i++) {
			 a[i] = sc.nextInt();
			 sum = sum=a[i];
		 }
		 double average = (double)sum/a.length;
		 System.out.println("average = "+average);
		 sc.close();

	}

}
