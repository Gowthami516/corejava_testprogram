package myfirstproject;

public class Objcount {
	static int objcount;
	{
		
		objcount++;
		
	}

	public static void main(String[] args) {
		
		
		Objcount a = new Objcount();
		Objcount b = new Objcount();
		Objcount c = new Objcount();
		System.out.println("objcount:" +objcount);
		
	}

}
