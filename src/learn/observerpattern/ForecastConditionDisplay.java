package learn.observerpattern;

public class ForecastConditionDisplay implements Observer{
	
	Subject weatherStation;
	
	public ForecastConditionDisplay(Subject weatherStation) {
		this.weatherStation = weatherStation;
		this.weatherStation.registerObserver(this);
	}

	@Override
	public void update(long temperature, long pressure, long humidity) {
		System.out.println("ForecastConditionDisplay : \nTemperature ="+temperature+"\npressure ="+pressure+"\nhumidity ="+humidity);
	}

}
