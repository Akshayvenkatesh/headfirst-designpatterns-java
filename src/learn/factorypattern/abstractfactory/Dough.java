package learn.factorypattern.abstractfactory;

public abstract class Dough {
	String name;
	
	public Dough() {
		this.name = "Unknown Dough";
	}

	public String getName() {
		return name;
	}
	
}
