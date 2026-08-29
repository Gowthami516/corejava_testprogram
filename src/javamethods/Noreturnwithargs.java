package javamethods;

import java.util.Scanner;

public class Noreturnwithargs {
	int age;
	String name;
	double salary;
	float height;
	char gender;
	void name() {
		System.out.println("employe name:");
		
	}
	void salary() {
		System.out.println("employe salary:");
		
	}
	void age() {
		System.out.println("employe age:");
		
	}
	void height() {
		System.out.println("employe height:");
		
	}
	void gender() {
		System.out.println("employe gender:");
		
	}
	 public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your age :");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter your name :");
		String name = sc.nextLine();
		
		System.out.println("enter your salary :");
		double salary = sc.nextDouble();
		
		System.out.println("enter your height :");
		float height = sc.nextFloat();
		
		
		System.out.println("enter your gender");
		char gender = sc.next().charAt(0);
		
		
		//method calling
		
		Noreturnwithargs p = new Noreturnwithargs();
		p.name();
		p.age();
		p.salary();
		p.height();
		p.gender();
		
		
		

	}

}
