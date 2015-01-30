package programs;

public class ConstrainedSum {

	private int sum;
	private int max;

	public ConstrainedSum(int max){
		this.max = max;
	}
	
	public void add(int number){		
		if(isValidAddition(number))
			this.sum += number;
		else
			throw new IllegalArgumentException();
	}
	
	public boolean isValidAddition(int number){
		return sum + number <= max;
	}
	
	public int getSum(){
		return sum;
	}
	
}
