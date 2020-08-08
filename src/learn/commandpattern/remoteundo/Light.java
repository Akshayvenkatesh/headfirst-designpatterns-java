package learn.commandpattern.remoteundo;

public class Light {
	private String type;
	
	public Light(String type) {
		this.type = type;
	}
	
	public void on(){
		System.out.println(type + " Light is on");
	}
	public void off(){
		System.out.println(type + " Light is off");
	}
}
