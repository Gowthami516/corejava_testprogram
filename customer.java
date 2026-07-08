package myfirstproject;

public class customer {
	int empid = 15;
	float grade = 9.1F;
	int salary = 65000;
	int empexp = 3;
	byte b = (byte)486;
	long L = 976845623;
    double d = 85753964;
    boolean boo = false;
    
	public static void main(String[] args) {
		customer s= new customer();
		
		System.out.println("employee id:" +s.empid);
		System.out.println("employee grade:"+s.grade);
		System.out.println("employee salary:" +s.salary);
		System.out.println("employee empexp:" +s.empexp);
		System.out.println("employee working days:" +s.b);
		System.out.println("employee phone number:" +s.L);
		System.out.println("bonus amount for employee:" +s.d);
		System.out.println("employee experience:" +s.boo);
		
		if(s.boo){
			System.out.println("employee have 3 years of experience");
		}
			else 
				System.out.println("employee has no experience");
			
		}
		
		
	}


