package weather.delegation;

public class TempEvent implements WeatherEvent {

	private double temp;

	public TempEvent(double temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return String.format("Temperature! At magnitude %f", temp);
	}

}
