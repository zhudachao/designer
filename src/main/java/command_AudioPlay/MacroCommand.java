package command_AudioPlay;

public  interface MacroCommand extends Command {
	
	public void add(Command cmd);
	public void remove(Command cmd);

}
