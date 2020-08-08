package learn.factorypattern;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		type = "ChicagoStyleCheesePizza";
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices..");
	}
}
