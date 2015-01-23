package nim;

public class ThreeNim {

	int[] piles = new int[3];
	
	public ThreeNim(){
		this(10);
	}	
	
	public ThreeNim(int pileSize){
		piles[0] = pileSize;
		piles[1] = pileSize;
		piles[2] = pileSize;
	}
	
	public void removeStones(int number, int targetPile){
		piles[targetPile-1] -= number;
	}

	@Override
	public String toString() {
		return "Pile 1: " + piles[0] 
				+ "\nPile 2: " + piles[1] 
				+ "\nPile 3: " + piles[2]; 
	}
	
	
}
