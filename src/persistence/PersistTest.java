package persistence;

import persistence.example1.PersistableProgram;
import persistence.formats.CSVFormatPersistence;
import persistence.formats.SuperFormatPersistence;

public class PersistTest {

	public static void main(String[] args){
		
		IStatePersistence persistence = new CSVFormatPersistence();
		
		//breakpoint
		PersistableProgram program = new PersistableProgram(persistence);
		
		
		//instanceof
		
		
		//cast og metoder
	}
	
}
