package command_AudioPlay;

public class Julia {
	public static void main(String[] args) {
		
	
	
	AudioPlayer audioPlayer=new AudioPlayer();
	
	Command playCommand=new PlayCommand(audioPlayer);
	Command rewindCommand=new RewindCommand(audioPlayer);
	Command stopCommand=new StopCommad(audioPlayer);
	
//	   KeyPad keypad=new KeyPad();
//	   keypad.setPlayCommand(playCommand);	  
//       keypad.setRewindCommand(rewindCommand);
//       keypad.setStopCommand(stopCommand);
//       //≤‚ ‘
//       keypad.play();
//       keypad.rewind();
//       keypad.stop();
//       keypad.play();
//       keypad.stop();
	   
	   
	MacroCommand marco=new MacroAudioCommand();
	 marco.add(playCommand);
     marco.add(rewindCommand);
     marco.add(stopCommand);
     marco.execute();
}
}
	
	
	
	
//   }


