package programs;

import java.util.Scanner;

public class SummingProgram {

	public static void main(String[] args){
		
		ConstrainedSum sum = new ConstrainedSum(100);
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()){
			int nextNumber = scanner.nextInt();
			if(sum.isValidAddition(nextNumber)){
				sum.add(nextNumber);
			}
			else{
				System.out.println("Summen kan ikke gå forbi maksimum.");
			}
			
				
			System.out.println("Summen er " + sum.getSum());
		}
		
	}
	
}
