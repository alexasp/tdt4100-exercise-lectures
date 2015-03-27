package inheritance.account;

public class Account {

	private double balance;

	public Account(double balance, double interestRate) {
		this.balance = balance;
	}

	public String toString() {
		return String.format("[Account balance=%f", balance);
	}	

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		if (newBalance < 0) {
			throw new IllegalStateException("The balance cannot become negative: " + newBalance);
		}
		balance = newBalance;
	}
	

}
