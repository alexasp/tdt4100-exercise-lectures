package skrivingavbrett;

import java.util.ArrayList;

/**
 * I denne representasjonen av et spillbrett er cellestrukturen representert som en liste, og det benyttes intern innkapsling:
 * countEmpty benytter den eksisterende getCell-metoden i stedet for � operere direkte p� feltet. Dersom typen eller logikken knyttet til
 * feltet endrer seg, kan det ofte v�re tilstrekkelig � endre kun getCell og setCell.
 * @author Alex
 *
 */
public class Board {

	private int rows;
	private int columns;
	
	private ArrayList<Cell> cells;

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.cells = new ArrayList<Cell>();
		
		fillCells();
		getCell(4, 2).setContent(null);
		getCell(1, 2).setContent(null);
		getCell(5, 8).setContent(null);
		getCell(7, 7).setContent(null);
	}
	

	private void fillCells() {
		for(int x = 0; x < this.columns; x++)
			for(int y = 0; y < this.rows; y++)
				cells.add(new Cell('O'));
	}

	@Override
	public String toString(){
		String boardLine = "";
		String result = "";
		
		for(int row = 0; row < this.rows * 2; row++){
			boardLine = boardLine + "-";
		}
		boardLine = boardLine + System.lineSeparator();
		
		result = boardLine;
		
		for(int y = 0; y < this.rows; y++){
			result = result + "|";
			for(int x = 0; x < this.columns; x++){
				result = result + getCell(x, y) + "|";
			}
			result = result + System.lineSeparator();
		}
		
		result = result + boardLine;
		
		return result;
	}

	public Cell getCell(int row, int column){
		return this.cells.get(row*rows + column);
	}
	

	public void setCell(Cell cell, int row, int column){
		this.cells.set(row*rows + column, cell);
	}


	public void init(String string) {
		for(int x = 0; x < this.columns; x++){
			for(int y = 0; y < this.rows; y++){
				cells.add(new Cell(string.charAt(3)));
			}
		}
	}
	
}
