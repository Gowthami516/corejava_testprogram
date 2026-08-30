package javaconstructors;

import java.util.Scanner;

public class LoanInterest {
	
      double calculateInterest(double principal, double rate, int time) {
    	  return (principal*rate*time)/100;
      }
       
	

	   void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal amount");
		double principal =  sc .nextDouble();
		
		System.out.println("enter rate of interest:");
		double rate = sc.nextDouble();
		
		System.out.println("enter time(in years):");
		int time = sc.nextInt();
		
		double interest = calculateInterest(principal,rate,time);
		
		System.out.println("simple Interest = " + interest);
		
		}

}
