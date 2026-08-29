package javamethods;

import java.util.Scanner;

public class Calculatorusingmethods {
	
	void add (int a,int b) {
		System.out.println("addition of two numbers:" +(a+b));
		
	}
	void sub (int a,int b) {
		System.out.println("subtractoin of two numbers:" +(a-b) );
		
	}
	void multiply (int a,int b) {
		System.out.println("multiplication of two numbers:" +(a-b) );
	}
	void divide (int a,int b) {
		System.out.println("divition of two numbers:" +(a-b) );
	}	
		
	

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number:");
		int num2 = sc.nextInt();
		
		add(num1,num2);
		sub(num1,num2);
		multiply(num1,num2);
		divide(num1,num2);
		sc.close();
		
		}

}
