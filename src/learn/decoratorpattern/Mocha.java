package learn.decoratorpattern;

public class Mocha extends ToppingDecorator {
	
	Beverage beverage;
	
	Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return this.beverage.getDescription() + ",Mocha";
	}

	public double getCost() {
		return 10.0 + this.beverage.getCost();
	}

}
