package chess;

import java.util.Stack;

public class Chess {

	private Stack<ChessMove> moves;
	
	private Stack<ChessMove> undoneMoves;
	
	public void movePiece(Location startingLocation, Location endLocation){
		boolean wasCapture = doMove(startingLocation, endLocation);
		moves.push(new ChessMove(endLocation, startingLocation, wasCapture));
	}
	
	public boolean doMove(Location starting, Location endLocation){
		
		ChessMove move = null;
		
		//.. create move based on starting location and endlocation
		
		updateGameState(move);
		
		undoneMoves.clear();
		
		return true;
	}
	
	private void updateGameState(ChessMove move) {
		//update game state based on move
	}

	public void undo(){
		ChessMove moveToUndo = moves.pop();
		
		//undo effects of the move on game state
		
		undoneMoves.push(moveToUndo);
	}
	
	public void redo(){
		ChessMove moveToRedo = undoneMoves.pop();
		
		updateGameState(moveToRedo);
		
		moves.push(moveToRedo);
	}
	
}
