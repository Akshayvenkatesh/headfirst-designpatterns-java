package learn.commandpattern.remotepartymode;

public class TVOffCommand implements Command{
	TV tv;

	public TVOffCommand(TV tv) {
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
