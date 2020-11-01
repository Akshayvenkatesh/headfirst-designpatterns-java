package learn.strategypattern;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	
	@Override
	void display() {
		System.out.println("This is Redhead Duck");
	}

}
