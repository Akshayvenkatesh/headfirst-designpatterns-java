package learn.simplefactorypattern;

public class PizzaStore {

	SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(SimplePizzaFactory simplePizzaFactory){
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public void orderPizza(String type){
		Pizza  pizza = this.simplePizzaFactory.createPizza(type);
		
		pizza.getType();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
	}
	
	public static void main(String[] args) {
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
		pizzaStore.orderPizza("veggie");
	}

}
