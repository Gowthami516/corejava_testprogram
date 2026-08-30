package javaconstructors;

public class copyconstructor {
	
	int empid;
	String empname;
	double salary;
	
	copyconstructor(copyconstructor c) {
		this.empid = c. empid;
		this.empname = c. empname;
		this.salary = c. salary;
	}
	
	
	

	 public copyconstructor(double salary) {
		
		this.salary = salary;
	}




	 copyconstructor(int empid, String empname, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	 
	 
	 void increment() {
		 empname = "sanju";
		 salary = 10000+salary;		 
	 }
	 
	 void display() {
		 System.out.println("employee id:" +empid);
		 System.out.println("employee name:" +empname);
		 System.out.println("employee salary:" +salary);
		 
	 }
	 
	 public static void main(String[] args) {
		 copyconstructor c1 = new copyconstructor(205,"sanju",10000);
		 c1.display();
		 
		 copyconstructor c2 = new copyconstructor(c1);
		 c2.increment();
		 c2.display();
		
		
	}

}
