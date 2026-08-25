package javaArrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {98,65,45,57,5,3};
		//int[] arr = {1,2,3,4,5};
		
		int temp = 0;
		System.out.println("before storting:");
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		int count1 = 0;
		for(int i =0; i<arr.length-1; i++) {
			//if we give already sorted elements we give boolean
			//boolean flag = false;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					//flag = true;
				}
				count1++;
			
			}
			count++;
			
			//if(!flag){
			//break;
			//}
		}
		System.out.println("count:" +count);
		System.out.println("count1:" +count1);
		System.out.println("after Sorting:");
		System.out.println(Arrays.toString(arr));
		
 
	}

}
