package learn.decoratorpattern;

public abstract class Beverage {
	public String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double getCost();
}
