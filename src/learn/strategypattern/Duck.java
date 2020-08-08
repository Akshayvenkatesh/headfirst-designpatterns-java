package learn.strategypattern;

public abstract class Duck {
	
	/*
	 * Strategy pattern defines family of algorithms, encapsulates each one and makes them interchangeable.
	 * Strategy pattern lets the algorithm vary independently from client that use it.
	 * 
	 * */
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void swim(){
		System.out.println("Ducks can swim.");
	}
	
	public void performFlyBehavior(){
		flyBehavior.fly();
	}
	
	public void performQuackBehavior(){
		quackBehavior.quack();
	}
	
	//dynamically assign values
	
	public void setFlyBehavior(FlyBehavior newFlyBehavior){
		this.flyBehavior = newFlyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior newQuackBehavior){
		this.quackBehavior = newQuackBehavior;
	}
	
	abstract void display();

}
