package myfirstproject;

public class Static {
	static {
		System.out.println("static method loaded");
		Static t = new Static();
		
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Static t = new Static();
		
	 }
	{
		System.out.println("instence block1 loaded");
		
	}
	{
		System.out.println("instence block2 loaded");
		
	}
	static {
		System.out.println("static method loaded");
		
		
	}
	

}
