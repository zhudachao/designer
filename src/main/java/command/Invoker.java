package command;

public class Invoker {
	
	private Command command=null;

//	public Invoker(Command command) {
//		super();
//		this.command = command;
//	}
	
	
	
	public Command getCommand() {
		return command;
	}



	public void setCommand(Command command) {
		this.command = command;
	}



	public void action(){
		command.execute();
	}

}
