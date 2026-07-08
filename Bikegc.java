package myfirstproject;

public class Bikegc {
	@Override
	protected void finalize() {
		System.out.println("object destoryed");
	
}
	void method1() {
		Bikegc t = new Bikegc();
	}

	public static void main(String[] args) {
		Bikegc t = new Bikegc();
		System.out.println(t);
		Bikegc s = new Bikegc();
		System.out.println(s);
		Bikegc f = new Bikegc();
		System.out.println(f);
		Bikegc k = new Bikegc();// object inside the method
		
		f = null;//nullifying
		t = s;//re-assign
		new Bikegc();//anonymous object
		
		
		
		
		System.gc();
		System.out.println(t);
		System.out.println(s);
		System.out.println(f);
		
		
		
	}

}
 