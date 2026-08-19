package loops;

import java.util.Scanner;

public class Armstrong3num {
//Armstrongnumber-->153,370,371-->1634
	
		static boolean isarmstrong(int n) {
			boolean status = false;
			int temp = n;
			int r = 0;
			int sump = 0;
			
			while (n>0) {
				r=n%10;
				n=n/10;
				sump = sump+r*r*r;
			}
			if(sump==temp) {
				status = true;
				
			}
			return status;
			
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number:");
			int n = sc.nextInt();
			
			boolean status = isarmstrong(n);
			if(status) {
				System.out.println("the given number is armstrong");
				
			}else {
				System.out.println("the given number is not a armstrong");
			}
			sc.close();
		

	}

}
