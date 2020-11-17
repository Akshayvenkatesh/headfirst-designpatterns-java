package learn.factorypattern.simple;

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

}
