package abstraction;

//what to do ,but not how to do

public interface Animal {
	
	public static final String ORG_NAME = "Vcube PET Store"; 
	
	public static void main(String[] args) {
		System.out.println("Hello Animal interface main method started");
	}
	
	public abstract void sound();// whether we declare or not every method is public &abstract
	
	public abstract void eat();
	
	public void walk();
	
	 public default void run() {
		 System.out.println("All animals can run !!");
		 hello();
	 }
	 //in interface , we can write any number of default methods.
	 default void sleep() {
		 System.out.println("Every animal sleep for sure !!");
		 hello();
	 }
	 
	 //private methods introduced to avoid duplication from defult methods,
	 //private methods we cannot override
	 private static void hello() {

		 System.out.println("Hello");
		 System.out.println("Hello");
		 System.out.println("Hello");
		 System.out.println("Hello");
	 }
	 
	 
	 //to provide constant behavior we use static methods
	 //static methods we cannot override
	 // generally static methods we can call by using class name or reference variable names but,
	 //interface static methods we can call only  by interface name but not object reference variable  
	 static void breath () {
		 System.out.println("Every animal should breath to survive !!");
		 hello();
	 }
	
	//void eat() {// abstract methods do not specify a boby
	//}
	

}
