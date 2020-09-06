package learn.proxypattern.gumballmachine;

import java.rmi.RemoteException;

public class GumballMachineMoniter {
	GumballMachineRemote gumballMachine;

	public GumballMachineMoniter(GumballMachineRemote gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void report() {
		try {
			System.out.println("Gumball Machine: " + this.gumballMachine.getLocation());
			System.out.println("Current inventory: " + this.gumballMachine.getCount() + " gumballs");
			System.out.println("Current State: " + this.gumballMachine.getState());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
