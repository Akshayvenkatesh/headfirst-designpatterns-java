package learn.abstractfactorypattern;

public abstract class Sauce {
	
	String name;
	
	public Sauce(){
		this.name = "Unknon Sauce";
	}
	
	public String getName() {
		return name;
	}
}
