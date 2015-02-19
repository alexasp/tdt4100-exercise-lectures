package nim;

public class Nim {

	private Pile[] piles;
	
	public Nim() {
		this(10);
	}	
	
	public Nim(int pileSize) {
		piles = new Pile[]{new Pile(pileSize), new Pile(pileSize), new Pile(pileSize)};
	}
	
	@Override
	public String toString() {
		return String.format("Piles: %d, %d, %d", piles[0], piles[1], piles[2]); 
	}
	
	public void removePieces(int number, int targetPile) {
		if (isGameOver()) {
			throw new IllegalStateException("Cannot remove pieces when game is over");
		}
	
		piles[targetPile].removePieces(number);
	}

	public boolean isValidMove(int number, int targetPile) {
		return piles[targetPile].isValidMove(number);
	}

	public boolean isGameOver() {
		return piles[0].getNumber() == 0 || piles[1].getNumber() == 0 || piles[2].getNumber() == 0;
	}

	public int getPileCount(int targetPile) {
		return piles[targetPile].getNumber();
	}
}
