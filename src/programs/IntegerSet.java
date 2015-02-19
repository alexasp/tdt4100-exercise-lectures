package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {

	private List<Integer> numbers = new ArrayList<Integer>();

	public static void main(String[] args){
		List<Integer> testSet = new ArrayList<Integer>();
		testSet.add(-96);
		testSet.add(-53);
		testSet.add(82);
		testSet.add(-24);
		testSet.add(82);
		testSet.add(-75);
		IntegerSet set = new IntegerSet(testSet);
		int result = set.distanceFromConsecutive(2);
		System.out.println(result);
	}
	
	public IntegerSet(List<Integer> numbers){
		this.numbers = numbers;
	}

	public int distanceFromConsecutive(int k){
		if(k == 1)
			return 0;
		
		Collections.sort(numbers);

		int minDistance = 47*10000000;
		for(int i = 0; i < this.numbers.size()-k+1; i++){
			int distance = movesToMakeConsecutive(i, i+k);
			if(distance < minDistance)
				minDistance = distance;
		}

		return minDistance;
	}
	
	private int movesToMakeConsecutive(int start, int end){
		int moves = 0;
		int rightLength = 0;
		int costOfLeftShift = sumOffsets(start, end);
		
		for(int i = start; i < end; i++){
			rightLength++;
			int pivotDifference = numbers.get(i+1) - numbers.get(i) - 1;
					
			int costOfRightShift = pivotDifference*rightLength;
			
						
			if(costOfRightShift >= costOfLeftShift){
				moves += costOfRightShift + costOfLeftShift - pivotDifference;
				break;
				
			}
			costOfLeftShift -= costOfRightShift;
			
			moves += costOfRightShift ;
			
			
		}
		
		return moves;
	}

	
	private int sumOffsets(int root, int end){
		int target = numbers.get(root) + 1;
		int total = 0;
		for(int i = 1; i < end; i++){
			total += numbers.get(i) - target;
			target++;
		}
		return total;
	}

}
