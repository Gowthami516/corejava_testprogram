package loops;

import java.util.Scanner;

public class ArmstrongNumber {
	
	boolean isArmstrong(int n) {
		boolean status = false;
		int temp = n;
		int r = 0;
		int sump =0;
		String digits = Integer.toString(n);
		int digitcount = digits.length();
		while(n>0) {
			r = n%10;
			n = n/10;
			sump = (int)(sump+Math.pow(r,digitcount));
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
