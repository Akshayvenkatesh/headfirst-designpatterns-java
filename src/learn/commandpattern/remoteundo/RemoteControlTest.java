package learn.commandpattern.remoteundo;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		Light livingRoomLight = new Light("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		
		remoteControl.onButtonPressed(0);
		remoteControl.offButtonPressed(0);
		
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		remoteControl.offButtonPressed(0);
		remoteControl.onButtonPressed(0);
		
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOffCommand);
		
		remoteControl.onButtonPressed(0);
		remoteControl.offButtonPressed(0);
		
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		remoteControl.onButtonPressed(1);
		
		System.out.println(remoteControl);
		remoteControl.undoButtonPressed();
		
		
		
		
	}
}
