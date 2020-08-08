package learn.commandpattern.remotepartymode;

public class MacroCommands implements Command{
	Command[] commands;
	
	public MacroCommands(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for(Command command : commands){
			command.execute();
		}
	}

	@Override
	public void undo() {
		for(int i=commands.length-1;i>=0;i--){
			this.commands[i].undo();
		}
	}
	
}
