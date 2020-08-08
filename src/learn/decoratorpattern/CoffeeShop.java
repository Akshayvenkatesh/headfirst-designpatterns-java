package learn.decoratorpattern;

public class CoffeeShop {

	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		beverage = new Mocha(beverage);
		beverage = new Milk(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.getCost());

	}

}
