package weather.observer;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeatherStreamReader {
	
	private static final String WIND = "wind";
	private static final String TEMP = "temp";
	private static final String DELIMITER = ",";
	private InputStream stream;

	public WeatherStreamReader(InputStream stream){
		this.stream = stream;
	}
	
	public void startReading(){
		Scanner scanner = new Scanner(this.stream);
		while(scanner.hasNext()){
			//notify curious objects
		}
	}

}
