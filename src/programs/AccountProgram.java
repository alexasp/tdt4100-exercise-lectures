package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AccountProgram {

	public static void main(String[] args){
		
		Account poorAccount = new Account();
		poorAccount.setBalance(0);
		
		Account mediumAccount = new Account();
		mediumAccount.setBalance(500);
		
		Account richAccount = new Account();
		richAccount.setBalance(10000);
		
		
		List<Account> accounts = new ArrayList<Account>();
		
		accounts.add(poorAccount);
		accounts.add(richAccount);
		accounts.add(mediumAccount);
		
		Collections.sort(accounts);

		int result = poorAccount.compareTo(richAccount);
		
		System.out.println(result);
	}
	
	
}
