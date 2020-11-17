package learn.factorypattern.simple;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
		pizzaStore.orderPizza("veggie");
	}
	
}
