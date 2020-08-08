package learn.commandpattern.simpleremote;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.on();
	}

}
