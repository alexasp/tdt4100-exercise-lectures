package persistence;

public interface IStatePersistence {

	public void saveToFormat(String uri, State state);
	
	public State loadToFormat(String uri);
	
}
