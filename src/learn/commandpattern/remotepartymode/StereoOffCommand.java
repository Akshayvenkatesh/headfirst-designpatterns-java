package learn.commandpattern.remotepartymode;

public class StereoOffCommand implements Command {

	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.off();
	}

	@Override
	public void undo() {
		this.stereo.on();
	}

}
