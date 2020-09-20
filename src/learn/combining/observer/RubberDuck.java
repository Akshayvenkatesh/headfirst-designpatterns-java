package learn.combining.observer;

public class RubberDuck implements Quackable{
	
	Observable observable;
	
	public RubberDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}
	
	public String toString() {
		return "Rubber Duck";
	}

}
