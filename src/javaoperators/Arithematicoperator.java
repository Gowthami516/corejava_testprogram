package javaoperators;

public class Arithematicoperator {

	public static void main(String[] args) {
    int a = 10;
    int b = 20;
    //string + anything is string only ,here first + is working like a concatenation
    System.out.println("addition of two numbers:" +a+b);//concatenation = 1020
    //the below statement is working based on BODMAS
    // + is addition -->sum
    System.out.println("addition of two number:" +(a+b));//sum = 30
    //CE; the operator- is  undefined for the argument type(s) string ,int
   // System.out.println("difference of two numbers:" +a-b);//CE
    //- is substraction--> difference
    System.out.println("substraction of two numbers:" +(a-b));
    //is multiplication-->product
    System.out.println("multiplication of two numbers:" +a*b);//200
    // / is division-->quotient
    System.out.println("divion of two numbers:" +a/b);//97/4=24
    // % is modulus--> remainder
    System.out.println("modulus of two numbers:" +a%b);//97%4=1
    System.out.println(5*2/3);//3
    
    }

}
