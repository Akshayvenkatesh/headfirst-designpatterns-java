package learn.observerpattern;

public class CurrentConditionsDisplay implements Observer{
	
	Subject weatherStation;
	
	public CurrentConditionsDisplay(Subject weatherStation) {
		this.weatherStation = weatherStation;
		this.weatherStation.registerObserver(this);
	}

	@Override
	public void update(long temperature, long pressure, long humidity) {
		System.out.println("CurrentConditionsDisplay :\ncurrentTemperature = "+ temperature + "\npressure = " + pressure + "\nhumidity = " +humidity);
	}

}
