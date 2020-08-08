package learn.commandpattern.remote;

public class GarageDoor {
	private String type;
	
	public GarageDoor(String type){
		this.type = type;
	}
	
	public void up(){
		System.out.println(type + " Garage Door is open.");
	}
	
	public void down(){
		System.out.println(type + " Garage Door is closed.");
	}
	
	public void stop(){
		System.out.println(type + " Garage Door is stopped.");
	}
	
	public void lightOn(){
		System.out.println(type + " Garage light is on.");
	}
	
	public void lightOff(){
		System.out.println(type + " Garage light is off.");
	}
}
