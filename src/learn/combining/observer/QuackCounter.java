package learn.combining.observer;

public class QuackCounter implements Quackable {

	private Quackable duck;
	private static int noOfQuacks;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		this.duck.quack();
		noOfQuacks++;
	}

	public static int getQuacks() {
		return noOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		this.duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		this.duck.notifyObservers();
	}

	public String toString() {
		return duck.toString();
	}

}
