package weather.observer;

import java.awt.event.WindowStateListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class WeatherProgram {

	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try(InputStream stream = new FileInputStream("weatherstream.txt")){
			
			WeatherStreamReader weatherReader = new WeatherStreamReader(stream);
			
			//set up listening objects
			
			//register listening objects
	
			weatherReader.startReading();
			
			//check states
		}
		
	}
}
