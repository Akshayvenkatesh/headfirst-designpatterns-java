package learn.decoratorpattern;

public class Expresso extends Beverage {
	
	public Expresso() {
		description = "Expresso";
	}

	@Override
	public double getCost() {
		return 150.0;
	}

}
