package myfirstproject;

public class Laptop {
	@Override
	protected void finalize() throws Throwable {
	    System.out.println("object destroy");
	}
	
	public static void main(String[] args) {
	    Laptop hp = new Laptop();
	    System.out.println(hp);
	    Laptop dell = new Laptop();
	    System.out.println(dell);
	    Laptop len = new Laptop();
	    System.out.println(len);
	    Laptop as = new Laptop();
	    System.out.println(as);
	    int a = 0x7ad041f3;
	    System.out.println(a);
	    int b =0x2b2fa4f7;
	    System.out.println(b);
	    
	    hp = null;
	    dell = null;
	    System.gc();
	    System.out.println(hp);
	    System.out.println(dell);
	    System.out.println(len);
	    System.out.println(as);
	    

	}

}
