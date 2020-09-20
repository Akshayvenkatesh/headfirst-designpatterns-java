package learn.combining.abstractfactory;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	public void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable goose = new GooseAdapter(new Goose());

		System.out.println("Duck Simulator: With Abstract factory\n");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);

		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
	}

	public void simulate(Quackable duck) {
		duck.quack();
	}
}
