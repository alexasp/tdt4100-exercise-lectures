package persistence.example2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import persistence.IStatePersistence;
import persistence.State;


/**
 * Class responsible for saving and loading to keep state when application is not running. This version takes 
 * the specific IStatePersistence implementation as a constructor parameter, which should be specified in the code
 * that instantiates PersistableProgram with new PersistableProgram( ... ). 
 * This version will always continue using that particular format.
 */
public class PersistableProgram {

	State programState;
	
	private IStatePersistence persistenceFormat;
	
	public PersistableProgram(IStatePersistence persistenceFormat){
		this.persistenceFormat = persistenceFormat;
	}
	
	/**
	 * Save to given uri, for instance file://home/myfile.txt
	 * @param uri
	 */
	public void save(String uri){
		persistenceFormat.saveToFormat(uri, programState);
	}

	public State load(String uri){
		return persistenceFormat.loadToFormat(uri);
	}
	
}
