package learn.iteratorpattern.dinermerger;

public class MenuTestDrive {

	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();
		
		System.out.println("\nVEGETARIAN");
		
		waitress.printVegetarianMenu();

	}

}
