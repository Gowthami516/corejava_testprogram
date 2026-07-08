package myfirstproject;

public class mall {
	int cusid;
	String cusname;
	String address;
	
	static int entryfees = 100;
	static String mallname = "trends";
	
	
	public static void main(String[] args) {
		System.out.println("mall details...");
		System.out.println("--------------------------------------");
		
		mall trends1 = new mall();
		trends1.cusid = 16;
		trends1.cusname = "anu";
		trends1.address = "narasaraopet";
		System.out.println("customer id:" +trends1.cusid);
		System.out.println("customer name:" +trends1.cusname);
		System.out.println("customer address:" +trends1.address);
		
		System.out.println("entryfees:" +entryfees);
		System.out.println("mall name:" +mallname);
		System.out.println("--------------------------------------");
		
	    int entryfees = 200;
		String mallname = "trends";

		
		mall trends2 = new mall();
		trends2.cusid = 15;
		trends2.cusname = "shahid";
		trends2.address ="hyd";	
		System.out.println("customer id:" +trends2.cusid);
		System.out.println("customer name:" +trends2.cusname);
		System.out.println("customer address:" +trends2.address);
		
		System.out.println("entryfees:" +entryfees);
		System.out.println("mall name:" +mallname);
		System.out.println("--------------------------------------");

		
		
		
		
		
		
		
		

	}

}
