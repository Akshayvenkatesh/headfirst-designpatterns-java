package learn.factorypattern.abstractfactory;

public abstract class Veggies {
	String name;
	
	public Veggies() {
		this.name = "Unknown Veggies";
	}

	public String getName() {
		return name;
	}
}
