package learn.factorypattern.abstractfactory;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		if(type.equals("Cheese")){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
		if(type.equals("Clam")){
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		return pizza;
	}

}
