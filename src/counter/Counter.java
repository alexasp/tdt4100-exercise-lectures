package counter;

public class Counter {

	int counter;
	int end;
	
	public Counter(int start, int end){
		this.counter = start;
		this.end = end;
	}
	
	public void count(){
		if(counter < end){
			counter = counter + 1;
		}
	}
	
}
