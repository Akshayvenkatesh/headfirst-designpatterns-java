package learn.commandpattern.remotepartymode;

public class HottubOnCommand implements Command{
	
	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		this.hottub.on();
		this.hottub.setTemperature(104);
		this.hottub.circulate();
	}

	@Override
	public void undo() {
		this.hottub.off();
		this.hottub.setTemperature(98);
	}

}
