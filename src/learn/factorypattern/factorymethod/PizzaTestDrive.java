package learn.factorypattern.factorymethod;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStypePizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.type+ "\n");
		
		PizzaStore chicagoPizzaStore = new ChicagoStypePizzaStore();
		pizza =chicagoPizzaStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.type+ "\n");

	}

}
