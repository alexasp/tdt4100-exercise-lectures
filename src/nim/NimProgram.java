package nim;

import java.util.Scanner;

public class NimProgram {

	public static void main(String[] args) {
		ThreeNim game = new ThreeNim(5);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(game.toString());
		
		while(scanner.hasNextLine()){
			String input = scanner.nextLine();
			String[] split = input.split(" ");
			int number = Integer.valueOf(split[0]);
			int targetPile = Integer.valueOf(split[1]);
			
			game.removeStones(number, targetPile);
			
			System.out.println(game.toString());
		}
		
		scanner.close();
	}

}
