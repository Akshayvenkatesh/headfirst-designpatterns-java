package learn.combining.observer;

public class GooseAdapter implements Quackable{
	
	Goose goose;
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		this.goose.honk();
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
		return "Goose pretending to be a Duck";
	}

}
