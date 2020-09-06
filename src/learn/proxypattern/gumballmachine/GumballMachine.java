package learn.proxypattern.gumballmachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;

	private String name;
	private String description;
	private String location;

	private State state;
	private int count = 0;

	public GumballMachine(String name, String description, String location, int count) throws RemoteException{
		this.name = name;
		this.description = description;
		this.location = location;
		this.count = count;
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		if (this.count > 0) {
			this.state = this.noQuarterState;
		}
	}

	public void insertQuarter() {
		this.state.insertQuarter();
	}

	public void ejectQuarter() {
		this.state.ejectQuarter();
	}

	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void refill(int count) {
		this.count = this.count + count;
		System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
		this.state.refill();
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (this.count != 0) {
			this.count = this.count - 1;
		}
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n" + this.name);
		result.append("\n" + this.description);
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + this.state + "\n");
		return result.toString();
	}

	public State getSoldOutState() {
		return this.soldOutState;
	}

	public State getNoQuarterState() {
		return this.noQuarterState;
	}

	public State getHasQuarterState() {
		return this.hasQuarterState;
	}

	public State getSoldState() {
		return this.soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public State getState() {
		return this.state;
	}

	public int getCount() {
		return this.count;
	}

	public String getLocation() {
		return location;
	}

}
