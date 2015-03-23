package weather.delegation.events;

import weather.delegation.WeatherEvent;

public class WindEvent implements WeatherEvent {

	private double dx;
	private double dy;

	public WindEvent(double dx, double dy) {
		this.dx = dx;
		this.dy = dy;
	}

	@Override
	public String toString() {
		return String.format("Wind! At magnitude %f", Math.sqrt(dx*dx + dy*dy));
	}
	
	
	
	
}
