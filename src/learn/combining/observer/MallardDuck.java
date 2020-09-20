package learn.combining.observer;

public class MallardDuck implements Quackable {
	
	Observable observable;
	
	public MallardDuck() {
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
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
		return "Mallard Duck";
	}
	
}
