package programs;

import java.util.ArrayList;

/**
 * I denne representasjonen av et spillbrett er cellestrukturen representert som en liste, og det benyttes intern innkapsling:
 * countEmpty benytter den eksisterende getCell-metoden i stedet for å operere direkte på feltet. Dersom typen eller logikken knyttet til
 * feltet endrer seg, kan det ofte være tilstrekkelig å endre kun getCell og setCell.
 * @author Alex
 *
 */
public class BoardMedInternInnkapsling {

	private int width;
	private int columns;
	
	private ArrayList<Cell> cells;

	public BoardMedInternInnkapsling(int rows, int columns) {
		this.width = rows;
		this.columns = columns;
		this.cells = new ArrayList<Cell>();
	}
	
	
	public int countEmpty(int row){
		int counter = 0;
		for(int i = 0; i < columns; i++){
			if(getCell(row, i).isEmpty()) //her benyttes intern metode for å hente felt i stedet for feltet direkte
				counter++;
		}
		return counter;
	}
	

	public Cell getCell(int row, int column){
		return this.cells.get(row*width + column);
	}
	

	public void setCell(Cell cell, int row, int column){
		this.cells.set(row*width + column, cell);
	}
	
}
