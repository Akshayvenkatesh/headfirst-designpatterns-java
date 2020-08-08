package learn.decoratorpattern;

public class Milk extends ToppingDecorator{
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Milk";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 25.0;
	}

}
