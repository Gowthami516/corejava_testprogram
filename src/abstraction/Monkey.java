package abstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("Monkey  can sounds like kichkichkichkichhhhh !!!");

		
	}

	@Override
	public void eat() {
		System.out.println("Monkey  can eat Banana !!");
		
	}
	
	
	@Override
	public void walk() {
		System.out.println("Monkey can walk and also Jumps !!");

		
	}
	//Default methods are allowed only in interfaces
	@Override
	public void run() {
		System.out.println("Monkey can run but mostly  jumps like anything !!");
	}
	

	
}
