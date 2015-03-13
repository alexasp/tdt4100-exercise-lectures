package chess;

public class ChessMove {

	private Location target;
	private Location current;
	private boolean wasCapture;

	public ChessMove(Location target, Location current, boolean wasCapture){
		this.target = target;
		this.current = current;
		this.wasCapture = wasCapture;
	}


	public Location getStartingLocation() {
		return current;
	}

	public Location getEndingLocation() {
		return target;
	}
	
}
