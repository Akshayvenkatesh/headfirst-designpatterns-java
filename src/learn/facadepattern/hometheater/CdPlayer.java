package learn.facadepattern.hometheater;

public class CdPlayer {
	String description;
	int currentTrack;
	Amplifier amplifier;
	String title;

	public CdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}

	public void on() {
		System.out.println(this.description + " on");
	}

	public void off() {
		System.out.println(this.description + " off");
	}

	public void eject() {
		this.title = null;
		System.out.println(this.description + " eject");
	}

	public void play(String title) {
		this.title = title;
		this.currentTrack = 0;
		System.out.println(this.description + " playing \"" + title + "\"");
	}

	public void play(int track) {
		if (this.title == null) {
			System.out.println(this.description + " can't play track " + this.currentTrack + ", no cd inserted");
		} else {
			this.currentTrack = track;
			System.out.println(this.description + " playing track " + this.currentTrack);
		}
	}

	public void stop() {
		this.currentTrack = 0;
		System.out.println(this.description + " stopped");
	}

	public void pause() {
		System.out.println(this.description + " paused \"" + title + "\"");
	}

	public String toString() {
		return this.description;
	}
}
