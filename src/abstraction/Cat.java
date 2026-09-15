package abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat can sounds like meow !!!");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat !!");
	}

	@Override
	public void walk() {
		System.out.println(" Cat walk came cat only !!");
		
	}

	

}
