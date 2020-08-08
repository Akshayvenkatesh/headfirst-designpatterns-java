package learn.facadepattern.hometheater;

public class DvdPlayer {

	String description;
	int currentChapter;
	Amplifier amplifier;
	String movie;

	public DvdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}

	public void on() {
		System.out.println(this.description +  " on");
	}

	public void play(String movie) {
		this.movie = movie;
		currentChapter = 0;
		System.out.println(this.description + " playing \"" + movie + "\"");
	}
	
	public void play(int chapter) {
		if (movie == null) {
			System.out.println(this.description + " can't play chapter " + chapter + " no movie selected");
		} else {
			this.currentChapter = chapter;
			System.out.println(this.description + " playing chapter " + currentChapter + " of \"" + this.movie + "\"");
		}
	}

	public void stop() {
		System.out.println(this.description + " stopped \"" + this.movie + "\"");
	}

	public void pause() {
		System.out.println(this.description + " paused \"" + movie + "\"");
	}
	
	public void setTwoChannelAudio() {
		System.out.println(this.description + " set two channel audio");
	}
 
	public void setSurroundAudio() {
		System.out.println(this.description + " set surround audio");
	}
	
	public void eject() {
		System.out.println(this.description + " eject");
	}

	public void off() {
		System.out.println(this.description + " off");
	}
	
	public String toString() {
		return this.description;
	}
}
