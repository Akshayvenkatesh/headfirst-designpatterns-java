package learn.observerpattern;

public class WeatherStationTest {
	public static void main(String[] args) {
		
		/*
		 * Observer pattern defines one to many relationship between the objects, 
		 * so that when one object changes its state all other dependencies are notified and updated automatically.
		 * 
		 * */
		
		WeatherStation weatherStation = new WeatherStation();
		//subject reference is used to remove to the observers.
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
		ForecastConditionDisplay foreCastDisplay = new ForecastConditionDisplay(weatherStation);
		
		weatherStation.setMeasurements(34L, 35, 23);
		
		weatherStation.unRegisterObserver(foreCastDisplay);
		
		weatherStation.setMeasurements(34L, 35, 23);
		
		
	}
}
