package command_AudioPlay;

public class KeyPad {
	
	private Command playCommand =null;;
	private Command rewindCommand=null;;
	private Command stopCommand=null;
	
	
	
	
	
//	public KeyPad(Command playCommand) {
//		super();
//		this.playCommand = playCommand;
//	}

	public KeyPad() {
		super();
	}
	
	
	


	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}

	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	
	
	public void play(){
		playCommand.execute();
	}
	public void rewind(){
		rewindCommand.execute();
	}
	public void stop(){
		stopCommand.execute();
	}
	
	
	
	
	

}
