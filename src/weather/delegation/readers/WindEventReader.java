package weather.delegation.readers;

import weather.delegation.WeatherEvent;
import weather.delegation.events.WindEvent;

public class WindEventReader {

	public WeatherEvent read(String[] parts) {
		return new WindEvent(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
	}



}
