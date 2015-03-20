package observer;

import java.awt.event.WindowStateListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class WeatherProgram {

	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try(InputStream stream = new FileInputStream("weatherstream.txt")){
			
			WeatherStreamReader weatherReader = new WeatherStreamReader(stream);
			
			TempStatistics tempStats = new TempStatistics();
			FeelsLikeTempStatistics feelsLikeStates = new FeelsLikeTempStatistics();
			
			weatherReader.addTempListener(tempStats);
			
			weatherReader.addTempListener(feelsLikeStates);
			weatherReader.addWindListener(feelsLikeStates);
	
			weatherReader.startReading();
			
			System.out.println(tempStats.toString());
			
			System.out.println(feelsLikeStates.toString());
		}
		
	}
}
