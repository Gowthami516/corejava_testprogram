package myfirstproject;

public class Employeegc {
	
	Employeegc(int a ,String b){
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroy");
	}
	int salary;
	String employee;

	public static void main(String[] args) {
		Employeegc s = new Employeegc(500,"sgwhs");
//		s. salary = 50000;
//		s.employee  = "anu";
//		System.out.println("employee salary:" +s.salary);
//		System.out.println("emeployee name:" +s.employee);
		System.out.println(s);
		Employee p = new Employee();
		p. salary = 60000;
		p.employee  = "meghana";
		System.out.println("employee salary:" +p.salary);
		System.out.println("emeployee name:" +p.employee);

		
	//	s = null;
	//System.gc();
	System.out.println(s);
	System.out.println(p);
	}

//	@Override
//	public String toString() {
//		return "Employeegc [salary=" + salary + ", employee=" + employee + "]";
//	}

}
