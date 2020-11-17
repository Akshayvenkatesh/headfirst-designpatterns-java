package learn.factorypattern.abstractfactory;

public abstract class Cheese {
	String name;
	
	public Cheese(){
		this.name = "Unknon Cheese";
	}
	
	public String getName() {
		return name;
	}
}
