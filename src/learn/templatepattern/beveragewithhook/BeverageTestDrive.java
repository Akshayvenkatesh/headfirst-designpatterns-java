package learn.templatepattern.beveragewithhook;

public class BeverageTestDrive {

	public static void main(String[] args) {
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		TeaWithHook teaHook = new TeaWithHook();

		System.out.println("Making coffee...");
		coffeeHook.prepareRecipe();

		System.out.println();
		System.out.println("Making tea...");
		teaHook.prepareRecipe();
	}

}
