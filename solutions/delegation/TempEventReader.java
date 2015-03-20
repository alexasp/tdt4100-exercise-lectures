package delegation;

public class TempEventReader {

	public WeatherEvent read(String[] parts) {
		return new TempEvent(Double.parseDouble(parts[1]));
	}

}
