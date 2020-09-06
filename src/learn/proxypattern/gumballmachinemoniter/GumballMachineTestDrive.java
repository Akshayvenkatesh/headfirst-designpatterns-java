package learn.proxypattern.gumballmachinemoniter;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count = 0;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}

		count = Integer.parseInt(args[1]);

		GumballMachine gumballMachine = new GumballMachine("Mighty Gumball, Inc.",
				"Java-enabled Standing Gumball Model #2004", args[0], count);

		GumballMachineMoniter gumballMachineMoniter = new GumballMachineMoniter(gumballMachine);

		gumballMachineMoniter.report();
	}

}
