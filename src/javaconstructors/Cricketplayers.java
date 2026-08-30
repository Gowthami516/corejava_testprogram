package javaconstructors;

import java.util.Scanner;

public class Cricketplayers {
	String player_name;
	int matches_played;
	int runs;
	
	
		
	
	   Cricketplayers(String player_name, int matches_played, int runs) {
		
		this.player_name = player_name;
		this.matches_played = matches_played;
		this.runs = runs;
		
	}




	   void playinfo() {
		
		double averageruns = (double) runs/matches_played;
		
		System.out.println("name of the player: +player_name");
		
		System.out.println("number of matches _played:" +runs);
		
		System.out.println("averageruns:" +averageruns);
		
				
	}
	   public static void main(String[] args) 
	   {
		   
	   Scanner sc = new Scanner(System.in);
	   
    	System.out.println("name of the player:");
    	String player_name = sc.nextLine();
    	System.out.println("number of the matches:" );
    	int matches_played = sc.nextInt();
    	System.out.println("enter total runs:");
    	int runs = sc.nextInt();
    	
    	Cricketplayers cp = new Cricketplayers( player_name, matches_played, runs);
    		
    		cp.playinfo();
    		
    		sc.close();
    	}
	   
    		
    	
}

