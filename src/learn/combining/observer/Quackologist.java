package learn.combining.observer;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

	public String toString() {
		return "Quackologist";
	}

}
