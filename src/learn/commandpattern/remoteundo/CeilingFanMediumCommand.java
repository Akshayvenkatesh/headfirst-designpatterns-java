package learn.commandpattern.remoteundo;

public class CeilingFanMediumCommand implements Command{
	
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.medium();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			this.ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			this.ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			this.ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			this.ceilingFan.off();
		}
	}
}
