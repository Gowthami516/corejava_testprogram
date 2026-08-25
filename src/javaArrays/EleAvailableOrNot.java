package javaArrays;

import java.util.Scanner;

public class EleAvailableOrNot {

	public static void main(String[] args) {
	int[] arr = {18,7,45,1,10,33,9,8};
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	int search = sc.nextInt();
	boolean status = false;
	
	for(int a:arr) {
		if(a==search) {
			System.out.println("the element is found:" +a);
			status = true;
			break;
		}
	}
	if(!status) {
		System.out.println("the element is not found!!" +search);
	}
	 sc.close();
	}

}
