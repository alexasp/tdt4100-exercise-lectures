package weather.delegation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import observer.FeelsLikeTempStatistics;
import observer.TempStatistics;
import observer.WeatherStreamReader;

public class WeatherIteratorProgram {

	
public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try(InputStream stream = new FileInputStream("weatherstream.txt")){
			
			WeatherStreamIterator iterator = new WeatherStreamIterator(stream);
			
			while(iterator.hasNext()){
				WeatherEvent next = iterator.next();
				System.out.println(next.toString());
			}

		}
		
	}
	
}
