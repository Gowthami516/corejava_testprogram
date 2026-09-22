package javaoperators;

import java. util.Scanner;

public class Salaryslipgenerator {
	void salaryslip(String empname,double basicsalary) {
		System.out.println("name of the employee:");
		System.out.println("basic salary");
		
		double HRA = basicsalary *20/100;
		double DA = basicsalary *10/100;
		double Grosssalary = basicsalary+HRA+DA;
		
		System.out.println("basic HRA:" +HRA);
		
		System.out.println("basic DA:" +DA);
		
		System.out.println("Grosssalary:" +Grosssalary);
	}
	

	    void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name of employee:");
		String name = sc.nextLine();
		System.out.println("basic salary:");
		double salary = sc.nextDouble();
		
		salaryslip(name,salary);
		
		

	}

}
