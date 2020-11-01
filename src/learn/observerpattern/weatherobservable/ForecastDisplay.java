package learn.observerpattern.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Display {
	
	private Observable observable;
	private long temperature;
	private long humidity;
	private long currentPressure = 29L;
	private long lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherStation) {
			WeatherStation weatherStation = (WeatherStation) o;
			this.humidity = weatherStation.getHumidity();
			this.lastPressure = weatherStation.getPressure();
			this.temperature = weatherStation.getTemperature();
			display();
		}
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
