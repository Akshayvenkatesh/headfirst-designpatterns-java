package learn.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

	ArrayList<Quackable> quackers = new ArrayList<>();
	Observable observable;

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quaker = iterator.next();
			quaker.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {}

	public String toString() {
		return "Flock of Ducks";
	}

}
