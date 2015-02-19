package nim;

public class Pile {

	private int currenPieceCount;

	public Pile(int pileSize) {
		this.currenPieceCount = pileSize;
	}

	public boolean isValidMove(int numberToRemove) {
		return numberToRemove > 0 && numberToRemove <= currenPieceCount;
	}

	public void removePieces(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("Number must be greater than zero");
		}
		if (number > currenPieceCount) {
			throw new IllegalArgumentException("Number cannot be greater than the pile (size)");
		}
		
		currenPieceCount -= number;
	}

	public int getNumber() {
		return currenPieceCount;
	}

}
