package exerciselecture.comparable;

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
		
		 
		int result = poorAccount.compareTo(richAccount);
		System.out.println("Resultat av poorAccount.compareTo" + result); //Vi kan se hvordan sammenligning returnerer negativt tall som indikerer at poorAccount
		
		List<Account> accounts = new ArrayList<Account>();
		
		accounts.add(poorAccount);
		accounts.add(richAccount);
		accounts.add(mediumAccount);
		
		Collections.sort(accounts); //etter dette kallet er accounts sortert i stigende rekkefølge. Bruk debugger for å observere dette.
		
		
		
	}
	
	
}
