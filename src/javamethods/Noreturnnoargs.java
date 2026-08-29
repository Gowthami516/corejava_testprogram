package javamethods;

public class Noreturnnoargs {
	void addition() {
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	void sub() {
		int a = 300;
		int b= 100;
		int diff = a+b;
		System.out.println(diff);
		
	}
	

	 void main() {
		 System.out.println("main method started");
		 addition();
		 sub();
		 System.out.println("main methoid ended");
		
	}

}
