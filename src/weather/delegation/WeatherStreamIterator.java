package weather.delegation;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class WeatherStreamIterator implements Iterator<WeatherEvent>{

	private static final String WIND = "wind";
	private static final String TEMP = "temp";
	private static final String DELIMITER = ",";
	
	private InputStream stream;
	private Scanner scanner;
	
	public WeatherStreamIterator(InputStream stream){
		this.stream = stream;
		this.scanner = new Scanner(stream);
	}

	@Override
	public boolean hasNext() {
		return scanner.hasNext();
	}

	@Override
	public WeatherEvent next() {
		String next = scanner.next();
		String[] parts = next.split(DELIMITER);

		//.. read next event
		
		return null;
	}
	
	
	
}
