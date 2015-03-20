package delegation;

import java.io.InputStream;

public class WeatherStreamIterator {

	private static final String WIND = "wind";
	private static final String TEMP = "temp";
	private InputStream stream;

	public WeatherStreamIterator(InputStream stream){
		this.stream = stream;
	}
	
}
