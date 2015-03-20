package weather.observer;

public class FeelsLikeTempStatistics {

	private double currentTemp;
	private double currentWindSpeed;


	public double getFeelsLikeTemp(){
		return 13.12 + 0.6125*currentTemp - 11.37*Math.pow(currentWindSpeed,0.16) + 0.3965*currentTemp*Math.pow(currentWindSpeed,0.16);
	}

	@Override
	public String toString() {
		return String.format("Temperaturen ute føles nå som %f.", getFeelsLikeTemp());
	}

	
	
}
