package learn.commandpattern.remote;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		this.garageDoor.up();
	}

}
