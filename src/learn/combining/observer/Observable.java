package learn.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

	ArrayList<Observer> observers = new ArrayList<>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}

}
