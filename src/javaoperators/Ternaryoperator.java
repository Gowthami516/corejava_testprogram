package javaoperators;

import java.util.Scanner;

public class Ternaryoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character:");
		char ch = sc.next().charAt(0);
		ch = Character.toLowerCase(ch);
		String result = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ?"vowels": "consonants";
		System.out.println(result);
		sc.close();
				
		
		}

}
