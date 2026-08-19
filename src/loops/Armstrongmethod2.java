package loops;

import java.util.Scanner;

public class Armstrongmethod2 {
	
	boolean isArmstrong(int n) {
		boolean status = false;
		
		int temp = n;
		int n1 = n;
		int r = 0;
		int sump =0;
		int digitcount = 0;
		
		while(n>0) {
			n = n/10;
			digitcount++;
		}
		while(n1>0) {
			r = n1%10;
			n1 = n1/10;
			sump = sump+Math.powExact(r,digitcount);
		}
		if (sump==temp) {
			status=true;
		}
		return status;
	}

	 	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		boolean status =isArmstrong(n);
		if (status) {
			System.out.println(" Given number is a Armstrong number");
		}else {
			System.out.println(" Given number is not a Armstrong number");
		}
		sc.close();
		
		

	}

}
