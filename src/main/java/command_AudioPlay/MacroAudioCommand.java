package command_AudioPlay;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {
	
	private List<Command> commandList= new ArrayList<Command>();
	
	//Ìí¼Óºê
	
//	private Command command;
//	
//	public void setCommand(Command command) {
//		this.command = command;
//	}

	

	public void execute() {
		for (Command cmd : commandList) {
			cmd.execute();
		}
	}

	public void add(Command cmd) {
		// TODO Auto-generated method stub
		commandList.add(cmd);

	}

	public void remove(Command cmd) {
		// TODO Auto-generated method stub
		commandList.remove(cmd);

	}

}
