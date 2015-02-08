package programs;

public class Board {

	private int rows;
	private int columns;
	
	private int[][] heltall;
	
	private String[][] cells;

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.cells = new Cell[rows][columns];
	}
	
	
	public int countEmpty(int row){
		int counter = 0;
		for(int i = 0; i < columns; i++){
			if(this.cells[row][i].isEmpty())
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
