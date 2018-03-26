package command_AudioPlay;

public class PlayCommand implements Command {
	
	private AudioPlayer audioPlayer;
	
	

	public PlayCommand(AudioPlayer audioPlayer) {
		super();
		this.audioPlayer = audioPlayer;
	}



	public void execute() {
		// TODO Auto-generated method stub
		audioPlayer.play();
	}

}
