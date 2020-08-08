package learn.facadepattern.hometheater;

public class TheaterLights {
	String description;

	public TheaterLights(String description) {
		this.description = description;
	}

	public void dim(int level) {
		System.out.println(this.description + " dimming to " + level + "%");
	}

	public void on() {
		System.out.println(this.description + " on");
	}

	public void off() {
		System.out.println(this.description + " off");
	}
}
