package javaoperators;

public class Unaryoperator1 {

	public static void main(String[] args) {
		int a =5;
		int b = 5;
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(b--);
		System.out.println(b--);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(b++);
		System.out.println(a--);
		System.out.println(b--);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(b--);
		System.out.println(b++);
		System.out.println("A value is :" +a);
		System.out.println("B value is :" +b);
		System.out.println(++a + ++b +--a + ++b);
		System.out.println(a++ +b++ - ++a - --b);
    
	}

}
