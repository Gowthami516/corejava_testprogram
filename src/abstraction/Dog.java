package abstraction;

public class Dog implements Animal{
	
	
	@Override
	public void sound() {
		System.out.println("Dog sounds like Bow Bow !! ");
	}
	@Override
	public void eat() {
		System.out.println("Dog eats mostly nog-veg !!");
	}	
	@Override
	public void walk() {
		System.out.println("Dog can walk and run like anything !!");
	}
	
	
}
