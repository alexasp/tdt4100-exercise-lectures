package programs;

import java.util.ArrayList;

/**
 * Denne varianten av Board flytter logikken knyttet til strukturen celler er representert med til en ekstern klasse. Her benytter
 * vi tradisjonell innkapsling for å slippe å forholde oss til hvordan cellestrukturen er representert. Som med intern innkapsling får vi 
 * fordelen av at vi kun må endre et begrenset sett med metoder når representasjonen eller logikken knyttet feltene endrer seg.
 * En potensiell ulempe er at vi får en mer komplisert objektstruktur å forholde oss til.
 * @author Alex
 *
 */
public class BoardUtvidetObjektstruktur {

	private int width;
	private int columns;
	
	private CellStructure cells;

	
	public BoardUtvidetObjektstruktur(int rows, int columns) {
		this.width = rows;
		this.columns = columns;
		this.cells = new CellStructure(rows, columns);
	}
	
	
	public int countEmpty(int row){
		int counter = 0;
		for(int i = 0; i < columns; i++){
			if(getCell(row, i).isEmpty())
				counter++;
		}
		return counter;
	}
	
	

	public Cell getCell(int row, int column){
		return this.cells.get(row, column);
	}
	

	public void setCell(Cell cell, int row, int column){
		this.cells.set(row, column, cell);
	}
	
}
