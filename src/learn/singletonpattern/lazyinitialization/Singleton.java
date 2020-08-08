package learn.singletonpattern.lazyinitialization;

public class Singleton {

	private static Singleton uniqueInstance;

	private Singleton() {
	}

	// this approach will fail in multiple threads environment.
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public void getSingletonType() {
		System.out.println("I will be created when the getInstance() is called. And Im not thread safe.");
	}
}
