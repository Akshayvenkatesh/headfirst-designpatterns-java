package learn.facadepattern.hometheater;

public class Projector {
	String description;
	DvdPlayer dvd;

	public Projector(String description, DvdPlayer dvd) {
		this.description = description;
		this.dvd = dvd;
	}

	public void on() {
		System.out.println(this.description + " on");
	}

	public void off() {
		System.out.println(this.description + " off");
	}

	public void wideScreenMode() {
		System.out.println(this.description + " in widescreen mode (16x9 aspect ratio)");
	}

	public String toString() {
		return this.description;
	}
}
