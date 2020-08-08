package learn.decoratorpattern;

public class Decaf extends Beverage {
	
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double getCost() {
		return 135.0;
	}

}
