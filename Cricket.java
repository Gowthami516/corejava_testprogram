package myfirstproject;

public class Cricket {
	int runs;
	String name;
	
	static String teamname = "India";
	

	public static void main(String[] args) {
		System.out.println("Indian cricket team");
		System.out.println("----------------------");
		
		Cricket t = new Cricket();
		
		
		t. name = "virat";
		t. runs = 68;
		System.out.println("name of the player:" +t.name);
		System.out.println("no.of runs:" +t.runs);
		System.out.println("teamname:" +teamname);
		
		System.out.println("--------------------------");
		
		Cricket p = new Cricket();
		p. name = "dhoni";
		p. runs = 92;
		System.out.println("name of the player:" +p.name);
		System.out.println("no.of runs:" +p.runs);
		System.out.println("teamname:" +teamname);
		
		System.out.println("--------------------------");
		String teamname ="afj";
		Cricket s = new Cricket();
		s. name = "rashid";
		s. runs = 55;
		System.out.println("name of the player:" +s.name);
		System.out.println("no.of runs:" +s.runs);
		System.out.println("teamname:" +teamname);
		
		
		
		

	}

}
