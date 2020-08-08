package learn.commandpattern.remote;

public class CeilingFan {
	private String type;
	
	public CeilingFan(String type){
		this.type = type;
	}
	
	public void on(){
		System.out.println(type + " CeilingFan is on.");
	}
	
	public void off(){
		System.out.println(type + " CeilingFan is off.");
	}
}
