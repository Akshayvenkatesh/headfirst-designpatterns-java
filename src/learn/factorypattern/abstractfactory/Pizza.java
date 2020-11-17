package learn.factorypattern.abstractfactory;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	public void bake(){
		System.out.println("Baking in progress");
	}
	
	public void cut(){
		System.out.println("Cut in progress");
	}
	
	public void box(){
		System.out.println("Pizza placed inside the packing box");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
}