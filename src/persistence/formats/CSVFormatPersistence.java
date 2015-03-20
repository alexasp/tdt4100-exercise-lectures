package persistence.formats;
import persistence.IStatePersistence;
import persistence.State;


public class CSVFormatPersistence implements IStatePersistence{

	@Override
	public void saveToFormat(String uri, State state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State loadToFormat(String uri) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public boolean isCsv(String uri){
		//.. kode som sjekker om filen på uri er av CSV-format
		
		return false;
	}

}
