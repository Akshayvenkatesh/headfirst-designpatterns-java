package learn.factorypattern.factorymethod;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		type = "ChicagoStyleClamPizza";
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices..");
	}
}
