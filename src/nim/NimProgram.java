package nim;

import java.util.Scanner;

public class NimProgram {

	public static void main(String[] args) {
		ThreeNim game = new ThreeNim(5);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(game.toString());
		
		while(scanner.hasNextLine()){
			
			
			String input = scanner.nextLine();
			
			
			if(input.equals("fjern")){
				System.out.println("Hvor mange?");
				int antall = scanner.nextInt();
				
				System.out.println("Fra hvilken?");
				int targetPile = scanner.nextInt();
				
				if(game.isLegalMove(antall, targetPile)){
					game.removeStones(antall, targetPile);
				}
				else{
					System.out.println("Ulovlig trekk.");
				}
			}
			
			String[] split = input.split(" fra ");
			int number = Integer.valueOf(split[0]);
			int targetPile = Integer.valueOf(split[1]);
			
			if(game.isLegalMove(number, targetPile)){
				game.removeStones(number, targetPile);
			}
			else{
				System.out.println("Ugyldig trekk.");
			}
			
			System.out.println(game.toString());
		}
		
		scanner.close();
	}

}
