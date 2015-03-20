package delegation;

public class WindEventReader {

	public WeatherEvent read(String[] parts) {
		return new WindEvent(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
	}



}
