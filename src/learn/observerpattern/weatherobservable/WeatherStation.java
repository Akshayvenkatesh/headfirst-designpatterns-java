package learn.observerpattern.weatherobservable;

import java.util.Observable;

public class WeatherStation extends Observable {

	private long temperature;
	private long humidity;
	private long pressure;

	public WeatherStation() {
	}

	public void measurementsChanges() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(long temperature, long pressure, long humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanges();
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
