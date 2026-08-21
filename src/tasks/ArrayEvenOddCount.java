package tasks;

import java.util.Scanner;

public class ArrayEvenOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]a = {2,5,8,9,12};
		
		int even = 0;
		int  odd = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				 even++;
			}else {
				odd++;
			}
		}
		System.out.println("even =" +even);
		System.out.println("odd =" +odd);
		sc.close();
		

	}

}
