package persistence.example1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import persistence.IStatePersistence;
import persistence.State;
import persistence.formats.CSVFormatPersistence;
import persistence.formats.SuperFormatPersistence;


/**
 * Class responsible for saving and loading to keep state when application is not running. This version uses
 * a method to determine which implementation of IStatePersistence to use, depending on the extension of the
 * target URI.
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
		IStatePersistence storageFormat = getPersistenceFormat(uri);
		persistenceFormat.saveToFormat(uri, programState);
	}
	
	public State load(String uri){
		return persistenceFormat.loadToFormat(uri);
	}
	
	private IStatePersistence getPersistenceFormat(String uri) {
		String[] parts = uri.split("\\.");
		String extension = parts[parts.length-1];
		
		if(extension.equals(".csv")){
			return new CSVFormatPersistence();
		} 
		else if(extension.equals(".super")){
			return new SuperFormatPersistence();
		}
		else{
			throw new IllegalArgumentException();
		}
		
	}
	
}
