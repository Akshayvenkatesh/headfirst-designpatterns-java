package learn.commandpattern.remotepartymode;

public class TVOnCommand implements Command{
	TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		this.tv.on();
	}

	@Override
	public void undo() {
		this.tv.off();
	}
	
}
