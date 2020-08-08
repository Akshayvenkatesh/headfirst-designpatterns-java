package learn.adapterpattern.duck;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		System.out.println("\nThe Duck says...");
		testDuck(mallardDuck);
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
