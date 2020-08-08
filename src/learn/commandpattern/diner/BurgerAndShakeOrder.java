package learn.commandpattern.diner;

public class BurgerAndShakeOrder implements Order{

	Cook cook;
	
	public BurgerAndShakeOrder(Cook cook) {
		this.cook = cook;
	}
	
	@Override
	public void orderUp() {
		this.cook.makeBurger();
		this.cook.makeShake();
	}
	
}
