package learn.facadepattern.hometheater;

public class Screen {
	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void down() {
		System.out.println(this.description + " going down");
	}

	public void up() {
		System.out.println(this.description + " going up");
	}
}
