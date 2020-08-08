package learn.commandpattern.remote;

public class Stereo {
	private String type;
	
	public Stereo(String type){
		this.type = type;
	}
	
	public void on(){
		System.out.println(type + " stereo is on");
	}
	
	public void off(){
		System.out.println(type + " stereo is off");
	}
	
	public void setCd(){
		System.out.println(type + " stereo is set for CD input");
	}
	
	public void setDvd(){
		System.out.println(type + " stereo is set for DVD input");
	}
	
	public void setRadio(){
		System.out.println(type + " stereo is set for Radio input");
	}
	
	public void setVolume(int volumne){
		System.out.println(type + " stereo volume set to "+volumne);
	}
}
