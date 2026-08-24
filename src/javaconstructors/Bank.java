package javaconstructors;

public class Bank {
	
	String accountholder;
	double accountnum;
	double balance;
	
	Bank(){
		this("unknown");	
	}
	Bank(String accountholder){
		this(accountholder,0.0);
	}
	Bank(String accountholder,double accountnum) {
		this(accountholder,accountnum, 0.0);
	}
	Bank(String accountholder,double accountnum,double balance) {
		this.accountholder = accountholder;
		this.accountnum = accountnum;
		this.balance = balance;
	}
	void balinfo() {
		System.out.println("name ot the account holder:" +accountholder);
		System.out.println("enter the accountnum:" +accountnum);
		System.out.println("check the balance:" +balance);
		
	}
	

	public static void main(String[] args) {
		Bank b1 = new Bank();
		Bank b2 = new Bank("siddu");
		Bank b3 = new Bank("siddu",12345679);
		Bank b4 = new Bank("siddu",12345679,9000);
		
		b1.balinfo();
		b2.balinfo();
		b3.balinfo();
		b4.balinfo();
		
		
		

	}

}
