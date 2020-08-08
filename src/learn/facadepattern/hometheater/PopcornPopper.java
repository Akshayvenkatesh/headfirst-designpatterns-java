package learn.facadepattern.hometheater;

public class PopcornPopper {
	String description;

	public PopcornPopper(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(this.description + " on");
	}

	public void pop() {
		System.out.println(this.description + " popping popcorn!");
	}

	public void off() {
		System.out.println(this.description + " off");
	}
}
