package javamethods;

import java.util.Scanner;

public class Withreturnnoargs {
	double salary;
	double bonus;
	
	double getsalary() {
		double sal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary:");
		sal = sc.nextDouble();
		
		return sal;
		
		
	}
	double getbonus() {
		double bonus=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bonus:");
		bonus = sc.nextDouble();
		sc.close();
	    return bonus;
		
		
	}
	

	public static void main(String[] args) {
		Withreturnnoargs p = new Withreturnnoargs();
		double s = p.getsalary();
		double b = p.getbonus();
		
		System.out.println("total salary :" +(s+b));
	}

}
