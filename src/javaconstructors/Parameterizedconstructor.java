package javaconstructors;

public class Parameterizedconstructor {
	int prod_id;
	String prod_name;
	double price;

	void product(int pid,String pname,double pr) {
	prod_id = pid;
    prod_name = pname;
    price = pr;
    
	}
	
	public static void main(String[] args) {
		System.out.println("product 1 details");
		Parameterizedconstructor s1 = new Parameterizedconstructor ();
		s1.prod_id = 145;
	    s1.prod_name = "shops";
	    s1.price = 150;
	    
	    System.out.println("name of the product:" +s1.prod_id);
	    System.out.println("product id:" +s1.prod_name);
	    System.out.println("product price:" +s1.price);
	    
	    
	    System.out.println("product 2 details");
		Parameterizedconstructor s2 = new Parameterizedconstructor ();
		s2.prod_id = 20;
	    s2.prod_name = "sunscream";
	    s2.price = 550;
	    
	    System.out.println("name of the product:" +s2.prod_id);
	    System.out.println("product id:" +s2.prod_name);
	    System.out.println("product price:" +s2.price);
	    
	    System.out.println("product 3 details");
		Parameterizedconstructor s3 = new Parameterizedconstructor ();
		s3.prod_id = 10;
	    s3.prod_name = "handwash";
	    s3.price = 150;
	    
	    System.out.println("name of the product:" +s3.prod_id);
	    System.out.println("product id:" +s3.prod_name);
	    System.out.println("product price:" +s3.price);
	    
	    
		
	}

}
