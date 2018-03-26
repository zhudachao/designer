package command_AudioPlay;

public class RewindCommand implements Command{
	
	private AudioPlayer audioPlayer;
	
	

	public RewindCommand(AudioPlayer audioPlayer) {
		super();
		this.audioPlayer = audioPlayer;
	}



	public void execute() {
		// TODO Auto-generated method stub
		audioPlayer.rewind();
	}

}
