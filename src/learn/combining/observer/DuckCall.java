package learn.combining.observer;

public class DuckCall implements Quackable {

	Observable observable;

	public DuckCall() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("kwak");
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
		return "Duck Call";
	}

}
