package learn.proxypattern.gumballmachine;

public class NoQuarterState implements State {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven’t inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there’s no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

	@Override
	public void refill() {

	}

	public String toString() {
		return "waiting for quarter";
	}

}
