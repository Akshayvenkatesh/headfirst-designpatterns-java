package learn.factorypattern;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		type = "ChicagoStylePepperoniPizza";
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices..");
	}
}
