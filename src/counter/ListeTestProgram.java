package counter;

public class ListeTestProgram {

	public static void main(String[] args){
		ListeTest test = new ListeTest();
		test.booleanList.add(true);
		for(int i = 0; i<test.booleanList.size(); i++)
			System.out.println(test.booleanList.get(i	));

	}
	
}
