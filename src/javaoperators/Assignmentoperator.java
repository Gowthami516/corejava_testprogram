package javaoperators;

public class Assignmentoperator {

	public static void main(String[] args) {
    int result = 10;
    System.out.println(result);
    result = result +5;
    System.out.println(result);
    //result = result +5.5 ;//CE:type mismatch:cannot convert from double to int // narrowing
    result = (int) (result+5.5); //explicit type casting
    System.out.println(result);
    result+=5.5;
    System.out.println(result);
    result-=5.5;
    System.out.println(result);
    result*=7;
    System.out.println(result);
    result%=8;
    System.out.println(result);
    result/=60;
    System.out.println(result);	
	
	}

}
