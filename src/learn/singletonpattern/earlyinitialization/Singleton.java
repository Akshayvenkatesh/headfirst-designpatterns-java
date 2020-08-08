package learn.singletonpattern.earlyinitialization;

public class Singleton {

	// if the instantiation is resource intensive, we have to opt for lazy initialization.
	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}

	public void getSingletonType() {
		System.out.println("I'm statically created singleton.");
	}
}
