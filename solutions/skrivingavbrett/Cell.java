package skrivingavbrett;

public class Cell {
	
	
	private Character content;

	public Cell(Character content) {
		this.content = content;
	}

	public boolean isEmpty() {
		return this.content != null;
	}

	public void setContent(Character content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return content != null ? content.toString() : ".";
	}
	
	
	
	

}
