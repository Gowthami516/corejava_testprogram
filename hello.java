package myfirstproject;

public class hello {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method start !!");
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main method ending !!");
		
	}

}
