package command;

public class ConcreteCommand implements Command{
	
	private Receiver receiver;

	public ConcreteCommand() {
		super();
	}

	

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}



	public Receiver getReceiver() {
		return receiver;
	}



	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}



	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
