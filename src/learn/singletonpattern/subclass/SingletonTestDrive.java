package learn.singletonpattern.subclass;

public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton hotterSingleton = HotterSingleton.getInstance();
		Singleton coolerSingleton = CoolerSingleton.getInstance();
		
		// Subclass will return the same instance.
		System.out.println(hotterSingleton);
		System.out.println(coolerSingleton);
	}
}
