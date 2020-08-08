package learn.commandpattern.remotepartymode;

public class RemoteControlTest {
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {lightOn,stereoOn,tvOn,hottubOn};
		Command[] partyOff = {lightOff,stereoOff,tvOff,hottubOff};
		
		MacroCommands partyOnMacro = new MacroCommands(partyOn);
		MacroCommands partyOffMacro = new MacroCommands(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonPressed(0);
		
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonPressed(0);
		
		System.out.println("--- Undo Macro commands---");
		remoteControl.undoButtonPressed();
		remoteControl.undoButtonPressed();
		
		
	}
}
