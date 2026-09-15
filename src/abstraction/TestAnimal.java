package abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("Welcome to nimal Park !!");
		
		//Cannot instantiate the type Animal
		//Animal a = new Animal();
		
		
		System.out.println("*********Dog Info*********");
		
		//Dog object can store it into Animal interface will consider as Abstractoin with up-casting 
		Animal d = new Dog();
		d.sound();
		d.eat();
		d.walk();
		d.run();
		System.out.println("*******************");
		
		System.out.println("*********Cat Info*********");
		Animal c = new Cat();
		c.sound();
		c.eat();
		c.walk();
		c.run();
		System.out.println("*******************");
		
		System.out.println("*********Cat Info*********");
		Animal m = new Monkey();
		m.sound();
		m.eat();
		m.walk();
		m.run();
		System.out.println("*******************");
	}

}
