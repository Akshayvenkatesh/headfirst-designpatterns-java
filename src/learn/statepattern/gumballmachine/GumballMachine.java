package learn.statepattern.gumballmachine;

public class GumballMachine {

	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	private int state = SOLD_OUT;
	private int count;

	public GumballMachine(int count) {
		this.count = count;
		if (this.count > 0) {
			this.state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if (this.state == NO_QUARTER) {
			this.state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (this.state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (this.state == SOLD) {
			System.out.println("Please wait, we’re already giving you a gumball");
		} else if (this.state == SOLD_OUT) {
			System.out.println("You can’t insert a quarter, the machine is sold out");
		}
	}

	public void ejectQuarter() {
		if (this.state == NO_QUARTER) {
			System.out.println("You haven’t inserted a quarter");
		} else if (this.state == HAS_QUARTER) {
			this.state = NO_QUARTER;
			System.out.println("Quarter Returned");
		} else if (this.state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (this.state == SOLD_OUT) {
			System.out.println("You can’t eject, you haven’t inserted a quarter yet");
		}
	}

	public void refill(int noOfGumballs) {
		this.count = noOfGumballs;
		this.state = NO_QUARTER;
	}

	public void turnCrank() {
		if (this.state == NO_QUARTER) {
			System.out.println("You turned but there’s no quarter");
		} else if (this.state == HAS_QUARTER) {
			this.state = SOLD;
			System.out.println("You turned...");
			dispense();
		} else if (this.state == SOLD) {
			System.out.println("Turning twice doesn’t get you another gumball!");
		} else if (this.state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		}
	}

	public void dispense() {
		if (this.state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (this.state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		} else if (this.state == SOLD) {
			System.out.println("A gumball comes rolling out the slot!");
			this.count = this.count - 1;
			if (this.count == 0) {
				this.state = SOLD_OUT;
				System.out.println("Oops, out of gumballs!");
			} else {
				this.state = NO_QUARTER;
			}
		} else if (this.state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		}
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUARTER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUARTER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
}
