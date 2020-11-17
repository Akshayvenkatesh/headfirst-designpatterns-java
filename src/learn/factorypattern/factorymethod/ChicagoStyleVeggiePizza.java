package learn.factorypattern.factorymethod;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		type = "ChicagoStyleVeggiePizza";
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices..");
	}
}
