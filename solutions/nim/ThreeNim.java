package nim;

public class ThreeNim {

	private int[] piles = new int[3];
	
	public ThreeNim(){
		this(10);
	}	
	
	public ThreeNim(int pileSize){
		piles[0] = pileSize;
		piles[1] = pileSize;
		piles[2] = pileSize;
	}
	
	public void removeStones(int number, int targetPile){
		if(isLegalMove(number, targetPile)){
			piles[targetPile-1] -= number;
		}
		else{
			throw new IllegalArgumentException();
		}
	}

	public boolean isLegalMove(int number, int targetPile){
		return piles[targetPile-1] - number >= 0;
	}

	private boolean gameOver() {
		return piles[0] == 0 || piles[1] == 0 || piles[2] == 0;
	}

	@Override
	public String toString() {
		return "Pile 1: " + piles[0] 
				+ "\nPile 2: " + piles[1] 
				+ "\nPile 3: " + piles[2]; 
	}
	
	
}
