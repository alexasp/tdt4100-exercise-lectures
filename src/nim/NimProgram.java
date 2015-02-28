package nim;

import java.util.Scanner;

public class NimProgram {

	public static void main(String[] args) {
		Nim game = new Nim(5);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(game.toString());
		
		while(scanner.hasNextLine()){
			
			
			String input = scanner.nextLine();
			
			
			if(input.equals("fjern")){
				System.out.println("Hvor mange?");
				int antall = scanner.nextInt();
				
				System.out.println("Fra hvilken?");
				int targetPile = scanner.nextInt();
				
				if(game.isValidMove(antall, targetPile)){
					game.removePieces(antall, targetPile);
				}
				else{
					System.out.println("Ulovlig trekk.");
				}
			}
			
			String[] split = input.split(" fra ");
			int number = Integer.valueOf(split[0]);
			int targetPile = Integer.valueOf(split[1]);
			
			if(game.isValidMove(number, targetPile)){
				game.removePieces(number, targetPile);
			}
			else{
				System.out.println("Ugyldig trekk.");
			}
			
			System.out.println(game.toString());
			
			
			if(game.isGameOver()){
				System.out.println("Game over!");
				break;
			}
		}
		
		scanner.close();
	}

}
