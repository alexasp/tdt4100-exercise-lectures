package programs;

public class CellStructure {

	public Cell getCell(int row, int column){
		return this.cells.get(row*width + column);
	}
	

	public void setCell(Cell cell, int row, int column){
		this.cells.set(row*width + column, cell);
	}
	
}
