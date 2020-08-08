package learn.strategypattern;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		flyBehavior = new FlyNoWay();
	}
	
	
	@Override
	void display() {
		System.out.println("This is Redhead Duck");
	}

}
