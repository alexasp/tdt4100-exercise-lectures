package programs;

import java.util.Scanner;

public class SumWithAbort {

	ConstrainedSum sum = new ConstrainedSum(100);
	Scanner scanner = new Scanner(System.in);
	
	while(scanner.hasNext()){
		if(scanner.hasNextInt()){
			sum.add(scanner.nextInt());
		}
		else{
			if(scanner.next().equals("exit")){
				break;
			}
		}
		
		System.out.println("Summen er " + sum.getSum());
	}
	
}
