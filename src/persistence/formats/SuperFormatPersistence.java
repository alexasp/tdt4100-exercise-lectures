package persistence.formats;
import persistence.IStatePersistence;
import persistence.State;


public class SuperFormatPersistence implements IStatePersistence{

	@Override
	public void saveToFormat(String uri, State state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State loadToFormat(String uri) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSuper(String uri){
		//.. kode som sjekker om filen på uri er av Super-format
		
		return false;
	}
	
}
