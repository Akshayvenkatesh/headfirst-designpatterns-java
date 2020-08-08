package learn.strategypattern;

public interface QuackBehavior {
	public void quack();
}


class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Ducks Quack");
	}
	
}

class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Ducks Squeak");
	}
	
}

class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Ducks can't Quack");
	}
	
}