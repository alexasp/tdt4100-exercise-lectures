package observer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class WeatherProgram {

	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try(InputStream stream = new FileInputStream("weatherstream.txt")){
			
			WeatherStreamReader weatherReader = new WeatherStreamReader(stream);
			
			TempListener listener = new TempStatistics();
			
			weatherReader.addTempListener(listener);
			
			weatherReader.startReading();
			
			System.out.println(listener.toString());
		}
		
	}
}
