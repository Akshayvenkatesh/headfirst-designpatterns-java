package learn.simplefactorypattern;

abstract class Pizza {
	
	String type = "unknown";
	
	public void getType(){
		System.out.println("Pizza Type " + type);
	}
	
	public void prepare(){
		System.out.println("Prepare the pizza..");
	}
	
	public void bake(){
		System.out.println("Baking in progress..");
	}
	
	public void cut(){
		System.out.println("Cutting into pieces..");
	}
	
	public void box(){
		System.out.println("Packing done..");
	}
}
