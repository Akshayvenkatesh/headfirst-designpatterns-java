package learn.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	List<Observer> observersList;
	private long temperature;
	private long humidity;
	private long pressure;
	
	public WeatherStation() {
		observersList = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer newObserver) {
		observersList.add(newObserver);
	}

	@Override
	public void unRegisterObserver(Observer removeObserver) {
		int index = observersList.indexOf(removeObserver);
		observersList.remove(index);
		System.out.println("Observer "+  (index+1) + " removed");
		
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observersList){
			o.update(temperature, pressure, humidity);
		}
		
	}
	
	public void setMeasurements(long temperature,long pressure,long humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		notifyObservers();
	}

	public long getTemperature() {
		return temperature;
	}

	public long getHumidity() {
		return humidity;
	}

	public long getPressure() {
		return pressure;
	}

}
