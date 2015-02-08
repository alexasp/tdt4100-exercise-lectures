package programs;

import java.util.Scanner;

public class SumNextLine {

	
	
	public static void main(String[] args){
		
		StringBuilder builder = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()){
			
			String line = scanner.nextLine();
			
			
			if(!line.equals("exit")){
				builder.append(line);
			}
			
			System.out.println("Strengen er " + builder.toString());
		}
	}
	
}
