package programs;

/**
 * I denne representasjonen av et spillbrett er cellestrukturen representert som en todimensjonal tabell, og alle kodelinjer refererer
 * direkte til dette feltet i stedet for å gå via eksisterende felt-logikk. Da må alle linjer som refererer til feltet endres hver gang
 * logikken eller typen knyttet til feltet endrer seg.
 * @author Alex
 *
 */
public class BoardUtenInternInnkapsling {

	private int rows;
	private int columns;

	
	private Cell[][] cells;

	public BoardUtenInternInnkapsling(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.cells = new Cell[rows][columns];
	}
	
	
	public int countEmpty(int row){
		int counter = 0;
		for(int i = 0; i < columns; i++){
			if(this.cells[row][i].isEmpty()) //her hentes feltet direkte i stedet for å bruke eksisterende metode
				counter++;
		}
		return counter;
	}
	

	public Cell getCell(int row, int column){
		return this.cells[row][column];
	}
	

	public void setCell(Cell cell, int row, int column){
		this.cells[row][column] = cell;
	}
	
}
