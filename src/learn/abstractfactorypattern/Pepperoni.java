package learn.abstractfactorypattern;

public abstract class Pepperoni {

	String name;
	
	public Pepperoni() {
		this.name = "Unknown Pepperoni";
	}

	public String getName() {
		return name;
	}
}
