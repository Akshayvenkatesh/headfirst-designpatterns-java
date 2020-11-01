package learn.observerpattern.weatherobservable;

public class WeatherStationTest {
	
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
		ForecastDisplay foreCastDisplay = new ForecastDisplay(weatherStation);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherStation);
		
		weatherStation.setMeasurements(34L, 35, 23);
		weatherStation.setMeasurements(34L, 35, 23);
		weatherStation.setMeasurements(78L, 90, 29);
	}
}
