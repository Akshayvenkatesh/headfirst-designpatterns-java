package learn.facadepattern.hometheater;

public class Amplifier {

	String description;
	Tuner tuner;
	DvdPlayer dvd;

	public Amplifier(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(this.description + " on");
	}

	public void off() {
		System.out.println(this.description + " off");
	}

	public void setDvd(DvdPlayer dvd) {
		this.dvd = dvd;
		System.out.println(this.description + " setting DVD player to " + this.dvd);
	}

	public void setSurroundSound() {
		System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " setting tuner to " + this.dvd);
		this.tuner = tuner;
	}

	public void setVolume(int volumn) {
		System.out.println("Top-O-Line Amplifier setting volume to " + volumn);
	}

}
