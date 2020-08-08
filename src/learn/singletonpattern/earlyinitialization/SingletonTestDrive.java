package learn.singletonpattern.earlyinitialization;

public class SingletonTestDrive {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		singleton.getSingletonType();

	}

}
