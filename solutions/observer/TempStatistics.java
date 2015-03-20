package observer;

import java.util.ArrayList;
import java.util.List;

public class TempStatistics implements TempListener{
	
		List<Double> temperatures = new ArrayList<Double>();
	
		public double getAverage(){
			double sum = 0;
			for(Double temp : temperatures){
				sum += temp;
			}
			
			return sum/(double)temperatures.size();
		}
		
		
		@Override
		public String toString(){
			return String.format("Snittemperaturen gitt siste målinger er %f.", getAverage());
		}


		@Override
		public void notifyTempChanged(double temp) {
			temperatures.add(temp);
		}
		
}
