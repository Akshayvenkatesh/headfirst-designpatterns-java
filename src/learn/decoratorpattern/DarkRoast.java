package learn.decoratorpattern;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double getCost() {
		return 120.0;
	}

}
