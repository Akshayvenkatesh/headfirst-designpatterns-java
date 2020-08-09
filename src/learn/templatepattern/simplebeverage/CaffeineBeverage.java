package learn.templatepattern.simplebeverage;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilwater();
		brew();
		addCondiments();
		pourInCup();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilwater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
