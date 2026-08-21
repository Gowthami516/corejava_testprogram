package javaArrays;

public class ArrayIntro {

	public static void main(String[] args) {
		//step-1:declaration
		int[] ages;
		//step-2: creation
		ages= new int[5];
		//step-3: Intilization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 16;
		ages[3] = 22;
		ages[4] = 18;
		//step-4: Representation
		//for loop
		for(int i=0; i<ages.length; i++) {
			if(ages[i]>18) {
			System.out.println(ages[i]);
				
				//for each loop
				//for(int ages1:ages) {
					//if(ages1>18) {
						//System.out.println(ages1);
					//}
				//}
			}
		}
		
	}

}
