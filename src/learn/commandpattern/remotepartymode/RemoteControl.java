package learn.commandpattern.remotepartymode;

import java.util.Stack;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Stack<Command> undoCommands;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		
		for(int i=0;i<7;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommands = new Stack<>();
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPressed(int slot){
		onCommands[slot].execute();
		undoCommands.push(onCommands[slot]);
	}
	
	public void offButtonPressed(int slot){
		offCommands[slot].execute();
		undoCommands.push(offCommands[slot]);
	}
	
	public void undoButtonPressed(){
		Command undoCommand = undoCommands.pop();
		undoCommand.undo();
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
			+ " " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
