package learn.templatepattern.beveragewithhook;

public abstract class CaffeineBeverageWithHook {

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
	
	boolean customerWantsCondiments(){
		return true;
	}
}
