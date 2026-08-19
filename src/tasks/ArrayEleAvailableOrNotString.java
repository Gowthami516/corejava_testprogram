package tasks;

import java.util.Scanner;

public class ArrayEleAvailableOrNotString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"sanju","rohit","sai"};
		System.out.println("enter a player name :");
		
		String search = sc.next();
		boolean status = false;
		
		for(String s:arr) {
			if(s.equals(search)) {
				System.out.println("player found is in team");
				status = true;
				break;
			}
		}
		if(!status) {
			System.out.println("player not found!! may be he is not in the team");
		}
		 sc.close();
	}

}
