package command_AudioPlay;

public class StopCommad implements Command{
	
	private AudioPlayer audioPlayer;
	
	

	public StopCommad(AudioPlayer audioPlayer) {
		super();
		this.audioPlayer = audioPlayer;
	}



	public void execute() {
		// TODO Auto-generated method stub
		audioPlayer.stop();
	}

}
