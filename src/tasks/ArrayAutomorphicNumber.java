package tasks;

import java.util.Scanner;

public class ArrayAutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number:");
		 int n = sc.nextInt();
		 
		 int square = n*n;
		 int  temp = n;
		 int divisor = 1;
		 
		 while(temp>0) {
			 divisor = divisor*10;
			 temp = temp/10;
		 }
		 if(square%divisor==n) {
			 System.out.println("automorphic number");
		 }else {
			 System.out.println("not an automorphic number");
	
			 }
		 sc.close();
		 
		 }
	 }


