package weather.delegation.events;

import weather.delegation.WeatherEvent;

public class UnknownEvent implements WeatherEvent{

	private String[] parts;

	public UnknownEvent(String[] parts) {
		this.parts = parts;
	}

	@Override
	public String toString() {
		return String.format("Unknown! It is this type: %s", parts[0]);
	}
	
}
