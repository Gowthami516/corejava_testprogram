package abstraction;

//what to do ,but not how to do

public interface Animal {
	
	public static final String ORG_NAME = "Vcube PET Store"; 
	
	public abstract void sound();// whether we declare or not every method is public &abstract
	
	public abstract void eat();
	
	public void walk();
	
	 default void run() {
		 System.out.println("All animals can run !!");
	 }
	
	//void eat() {// abstract methods do not specify a boby
	//}
	

}
