package learn.singletonpattern.synchronizedmethod;

public class Singleton {
	
	private static Singleton uniqueInstance;
	
	private Singleton(){
	}
	
	// Using synchronized method will lead to performance decrease.if performance doesn't matter we can opt this approach.  
	public static synchronized Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public void getSingletonType() {
		System.out.println("I will be created inside the synchronized getInstance().");
	}
}
