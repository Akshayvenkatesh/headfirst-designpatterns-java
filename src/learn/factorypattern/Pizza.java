package learn.factorypattern;

public class Pizza {

	String type = "unknown";

	void prepare() {
		System.out.println("Preparing " + type);
	}

	public void getType() {
		System.out.println("Pizza Type " + type);
	}

	public void bake() {
		System.out.println("Baking in progress..");
	}

	public void cut() {
		System.out.println("Cut the pizza into diagonal slices..");
	}

	public void box() {
		System.out.println("Packing done..");
	}

}
