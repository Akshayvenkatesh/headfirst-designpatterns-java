package learn.abstractfactorypattern;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		
		dough = this.pizzaIngredientFactory.createDough();
		sauce = this.pizzaIngredientFactory.createSauce();
		cheese = this.pizzaIngredientFactory.createCheese();
		veggies = this.pizzaIngredientFactory.createVeggies();
		clam = this.pizzaIngredientFactory.createClams();
		
		System.out.println("Dough " + dough.getName());
		System.out.println("Sauce " + sauce.getName());
		System.out.println("Cheese " + cheese.getName());
		for(Veggies veggie : veggies){
			System.out.println("Veggies " + veggie.getName());
		}
		System.out.println("Clams " + clam.getName());
	}

}
