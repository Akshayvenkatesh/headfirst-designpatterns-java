package learn.observerpattern.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display{
	
	private Observable observable;
	private long temperature;
	private long humidity;
	private long pressure;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay :\ncurrentTemperature = "+ temperature + "\npressure = " + pressure + "\nhumidity = " +humidity);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherStation) {
			WeatherStation weatherStation = (WeatherStation) o;
			this.temperature = weatherStation.getTemperature();
			this.humidity = weatherStation.getHumidity();
			this.pressure = weatherStation.getPressure();
			display();
		}
	}

}
