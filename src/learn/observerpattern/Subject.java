package learn.observerpattern;

public interface Subject {
	void registerObserver(Observer newObserver);
	void unRegisterObserver(Observer removeObserver);
	void notifyObservers();
}
