package learn.commandpattern.remote;

public class StereoOnWithCDCommand implements Command {
	
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.on();
		this.stereo.setCd();
		this.stereo.setVolume(11);
	}

}
