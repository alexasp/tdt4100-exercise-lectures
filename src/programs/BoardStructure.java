package programs;

import java.util.ArrayList;


public class BoardStructure {

	private int width;
	private int columns;
	
	private CellStructure cells;

	public BoardStructure(int rows, int columns) {
		this.width = rows;
		this.columns = columns;
		this.cells = new CellStructure(rows, columns)
	}
	
	
	public int countEmpty(int row){
		int counter = 0;
		for(int i = 0; i < columns; i++){
			if(getCell(row, i).isEmpty())
				counter++;
		}
		return counter;
	}
	
	
	public void setRow(int row, Cell cell){
		for(int i = 0; i < columns; i++){
			setCell(cell, row, i);
		}
	}
	

	public Cell getCell(int row, int column){
		return this.cells.get(row*width + column);
	}
	

	public void setCell(Cell cell, int row, int column){
		this.cells.set(row*width + column, cell);
	}
	
}
