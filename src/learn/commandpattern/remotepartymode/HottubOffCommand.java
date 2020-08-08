package learn.commandpattern.remotepartymode;

public class HottubOffCommand implements Command{
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		this.hottub.off();
		this.hottub.setTemperature(98);
	}

	@Override
	public void undo() {
		this.hottub.on();
		this.hottub.setTemperature(104);
		this.hottub.circulate();
	}
}
