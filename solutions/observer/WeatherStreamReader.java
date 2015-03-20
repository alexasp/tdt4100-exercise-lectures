package observer;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeatherStreamReader {
	
	private static final String WIND = "wind";
	private static final String TEMP = "temp";
	private InputStream stream;
	private List<TempListener> tempListeners;

	public WeatherStreamReader(InputStream stream){
		this.tempListeners = new ArrayList<TempListener>();
		this.stream = stream;
	}
	
	public void startReading(){
		Scanner scanner = new Scanner(this.stream);
		while(scanner.hasNext()){
			String[] eventParts = scanner.next().split(",");
			
			if(eventParts[0].equals(WIND)){
				notifyWindListeners(Double.parseDouble(eventParts[1]), Double.parseDouble(eventParts[2]));
			}
			
			if(eventParts[0].equals(TEMP)){
				notifyTempListeners(Double.parseDouble(eventParts[1]));
			}
		}
	}

	private void notifyTempListeners(double temp) {
		for(TempListener listener : tempListeners){
			listener.notifyTempChanged(temp);
		}
	}

	private void notifyWindListeners(double dx, double dy) {
		//..
	}

	public void addTempListener(TempListener listener) {
		this.tempListeners.add(listener);
	}
}
