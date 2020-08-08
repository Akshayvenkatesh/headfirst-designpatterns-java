package learn.decoratorpattern;;

class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double getCost() {
		return 140.0;
	}

}
