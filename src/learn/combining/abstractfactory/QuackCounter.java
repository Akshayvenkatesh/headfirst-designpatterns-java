package learn.combining.abstractfactory;

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

}
