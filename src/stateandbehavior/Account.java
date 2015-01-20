package stateandbehavior;

public class Account {
	
	
	
	public double balance;
	public double interestRate;
	
	
	
	
	
	public void deposit(double input) {
		if (input >= 0) {
			balance = input;
			return balance;
		} else {
			balance = 0;
			return balance;
		}	
	} 
	
	public void addInterest() {
		balance+=balance * (interestRate/100);
		return balance;
		
	}
	
	public static void main(String[] args){
	Account account = new Account();
        double a = account.deposit(100);
        System.out.println(a);
        double b = account.addInterest();
        System.out.println(b);
       
	}	
	
}