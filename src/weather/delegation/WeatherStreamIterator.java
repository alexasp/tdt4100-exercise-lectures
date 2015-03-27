package weather.delegation;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

import weather.delegation.events.UnknownEvent;
import weather.delegation.readers.TempEventReader;
import weather.delegation.readers.WindEventReader;


public class WeatherStreamIterator implements Iterator<WeatherEvent>{

	private static final String WIND = "wind";
	private static final String TEMP = "temp";
	private static final String DELIMITER = ",";
	private InputStream stream;
	private Scanner scanner;
	
	private WindEventReader windEventReader;
	private TempEventReader tempEventReader;

	public WeatherStreamIterator(InputStream stream){
		this.stream = stream;
		this.scanner = new Scanner(stream);
		
		this.windEventReader = new WindEventReader();
		this.tempEventReader = new TempEventReader();
	}

	@Override
	public boolean hasNext() {
		return scanner.hasNext();
	}

	@Override
	public WeatherEvent next() {
		String next = scanner.next();
		String[] parts = next.split(DELIMITER);
		
		if(parts[0].equals(WIND)){
			return windEventReader.read(parts);
		}
		else if(parts[0].equals(TEMP)){
			return tempEventReader.read(parts);
		}
		else{
			return new UnknownEvent(parts);
		}
	}
	
	
	
}
