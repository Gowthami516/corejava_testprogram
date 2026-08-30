package javaconstructors;

import java.util.Scanner;

public class Patient {
	
	String patientname;
	int age;
	double roomcharges;
	int daysadmitted;
	
	Patient() {
		
	}
	
	Patient(String patientname,int age,double roomcharges,int daysadmitted) {
		this.patientname = patientname;
		this.age = age;
		this.roomcharges = roomcharges;
		this.daysadmitted = daysadmitted;
	}
	
	void patientinfo() {
		double totalhospitalbill = (double) roomcharges*daysadmitted;
		System.out.println("enter patient name:" +patientname);
		System.out.println("enter patient age:" +age);
		System.out.println("enter room charges per day:" +roomcharges);
		System.out.println("no.f days admitted:" +daysadmitted);
		System.out.println("totalhosipitallbill:" +totalhospitalbill);
		
		
	}

	
	void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter patient name:");
		String name = sc.nextLine();
		System.out.println("enter patient age:");
		int age = sc.nextInt();
		System.out.println("enter room charges per day:");
		double roomcharges = sc.nextDouble();
		System.out.println("no.of days admitted:");
	    int daysadmitted = sc.nextInt(); 

	    
	    Patient p = new Patient(name,age,roomcharges,daysadmitted);
	    
	    p.patientinfo();
	    
	    sc.close();
	    
	}

}
