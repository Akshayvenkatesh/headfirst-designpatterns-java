package learn.commandpattern.remote;

public class CeilingFanOffCommand implements Command{
	CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		this.ceilingFan.off();
	}
}
