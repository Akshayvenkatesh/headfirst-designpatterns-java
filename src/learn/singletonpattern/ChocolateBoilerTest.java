package learn.singletonpattern;

public class ChocolateBoilerTest {
	public static void main(String[] args) {
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
		System.out.println(chocolateBoiler);
		
		// will return the existing instance
		ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
		System.out.println(chocolateBoiler2);
	}
}
