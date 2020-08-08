package learn.commandpattern.remoteundo;

public interface Command {
	
	public void execute();
	public void undo();
	
}
