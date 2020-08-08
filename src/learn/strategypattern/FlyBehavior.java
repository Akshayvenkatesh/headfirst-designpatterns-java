package learn.strategypattern;

public interface FlyBehavior {
	public void fly();
}


class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Ducks can fly");
	}
	
}

class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Ducks can't fly");
	}
	
}