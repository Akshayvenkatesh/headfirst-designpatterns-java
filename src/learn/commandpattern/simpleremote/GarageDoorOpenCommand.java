package learn.commandpattern.simpleremote;

public class GarageDoorOpenCommand implements Command{
	
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.up();
	}

}
