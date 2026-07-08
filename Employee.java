package myfirstproject;

public class Employee {
	int salary;
	String employee;
	
	static String company="vcube";
	static String location ="hyd";
	

	public static void main(String[] args) {
		System.out.println("employee details......");
		System.out.println("-------------------");
		Employee s = new Employee();
		s. salary = 50000;
		s.employee  = "anu";
		System.out.println("employee salary:" +s.salary);
		System.out.println("emeployee name:" +s.employee);
		System.out.println("employee company:" +company);
		System.out.println("employee location:" +location);
		System.out.println("----------------------");
		
		Employee p = new Employee();
		p. salary = 60000;
		p.employee  = "meghana";
		System.out.println("employee salary:" +p.salary);
		System.out.println("emeployee name:" +p.employee);
		System.out.println("employee company:" +company);
		System.out.println("employee location:" +location);
		System.out.println("----------------------");
		
		
		
	
		
  

	}

}
