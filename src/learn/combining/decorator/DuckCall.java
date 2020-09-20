package learn.combining.decorator;

public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("kwak");
	}

}
