package learn.abstractfactorypattern;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore npPizzaStore = new NYPizzaStore();
		Pizza pizza = npPizzaStore.orderPizza("Cheese");
		
		System.out.println("Ethan ordered a " + pizza.getName()+ "\n");
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzStore();
		chicagoPizzaStore.orderPizza("Cheese");
		
		System.out.println("Joel ordered a " + pizza.getName()+ "\n");
	}

}
