package learn.strategypattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFlyBehavior();
		mallard.performQuackBehavior();
		
		
		Duck redheadDuck = new RedheadDuck();
		redheadDuck.display();
		redheadDuck.performFlyBehavior();
		//assigning behavior dynamically without modifying the class.
		redheadDuck.setFlyBehavior(new FlyWithWings());
		redheadDuck.performFlyBehavior();
		
	}

}
