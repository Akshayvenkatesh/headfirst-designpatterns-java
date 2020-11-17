package learn.factorypattern.simple;

public class SimplePizzaFactory {

	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("veggie")){
			pizza = new VeggiePizza();
		} else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}
		return pizza;
	}
}
