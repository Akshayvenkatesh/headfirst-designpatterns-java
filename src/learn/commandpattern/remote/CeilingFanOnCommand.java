package learn.commandpattern.remote;

public class CeilingFanOnCommand implements Command{
	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		this.ceilingFan.on();
	}
	
}
