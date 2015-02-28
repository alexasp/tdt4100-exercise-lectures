package programs;

public class Account implements Comparable<Account>{

	private double balance;
	private double interestRate;
	
	public String toString() {
		return String.format("[Account balance=%f interestRate=%f", balance, interestRate);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}

	@Override
	public int compareTo(Account arg0) {
		if(this.balance == arg0.getBalance()){
			return 0;
		}
		if(this.balance < arg0.getBalance()){
			return -1;
		}
		else{
			return 1;
		}
	
	}

	public void setBalance(int i) {
		this.balance = i;
	}
	
	public double getBalance(){
		return this.balance;
	}

}

