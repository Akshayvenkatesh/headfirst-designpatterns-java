package learn.singletonpattern.doublecheck;

public class Singleton {

	private volatile static Singleton uniqueInstance;

	private Singleton() {
	}

	// The synchronized block is executed only once. At the time of instance creation.
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

	public void getSingletonType() {
		System.out.println("I will do double check while creating instance in getInstance().");
	}
}
