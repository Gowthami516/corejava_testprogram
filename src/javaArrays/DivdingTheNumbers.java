package javaArrays;

import java.util.Scanner;

public class DivdingTheNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array:");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		System.out.println("enter "+ n + "numbers:");
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int positivecount = 0;
		int negitivecount = 0;
		int zerocount = 0;
		
		for(int i = 0; i<n; i++) {
			if(a[i] >0) {
				positivecount ++;
				}else if (a[i] <0) {
					negitivecount++;
				} else {
					zerocount++;
				}
		}
		//create 3 arrays
		int[]positive = new int[positivecount];
		int[]negitive = new int[negitivecount];
		int[]zero = new int[zerocount];
		
		int p = 0, ne = 0, z = 0;
		
		//store values in respective arrays
		for(int i = 0; i<n; i++) {
			
			if (a[i] >0) {
				positive[p++] = a[i];
			}else if (a[i] <0) {
			 negitive[ne++] = a[i];
			}else {
				zero[z++] = a[i];
			}
	}
		System.out.println("positive numbers:");
		for(int x : positive) {
			System.out.print(x+" ");
		}
		System.out.println("\n negitive numbers:");
		for(int x : negitive) {
			System.out.print(x+" ");
		}
		System.out.println("\n zeros:");
		for(int x : zero) {
			System.out.print(x+" ");
		}
		sc.close();
		 }
 }
	

