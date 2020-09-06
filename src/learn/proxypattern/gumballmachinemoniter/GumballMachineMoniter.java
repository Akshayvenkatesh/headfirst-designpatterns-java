package learn.proxypattern.gumballmachinemoniter;

public class GumballMachineMoniter {
	GumballMachine gumballMachine;

	public GumballMachineMoniter(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void report() {
		System.out.println("Gumball Machine: " + this.gumballMachine.getLocation());
		System.out.println("Current inventory: " + this.gumballMachine.getCount() + "gumballs");
		System.out.println("Current State: " + this.gumballMachine.getState());
	}
}
