package weather.delegation.readers;

import weather.delegation.WeatherEvent;
import weather.delegation.events.TempEvent;

public class TempEventReader {

	public WeatherEvent read(String[] parts) {
		return new TempEvent(Double.parseDouble(parts[1]));
	}

}
