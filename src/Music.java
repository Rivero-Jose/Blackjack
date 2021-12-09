import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class Music implements LineListener {
	boolean playCompleted;
	boolean b = true;
	public void msg(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	
	public void play(){
		InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("BlackJack.wav"));
		Luka M = new Luka();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.loop(9999);
            if(b == true){
            	String[] DATA = {"Yes","No"};
            	int x = JOptionPane.showOptionDialog(null, "Since I was unable to find a good English version of the song... \n" +
            			"Do you want to know the English Lyrics at least? \n" +
            			"Note there will be multiple messages telling you the lyrics of the song.", "BlackJack song", 0,
        				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
        		if(x == 0){
        			msg("I'll stop after this -one more time-\nI'm so sick of it I'll throw it away --one more time-\nBut before I do I'll try it again --one more time-\nCuz I'm the girl who'll make you feel good\n \nRed noise rips the moonlight up into shreds\nShouts that echo through the streets one more time\nNow just bring those cold and lonely lips up to mine\nAnd we'll see what lies start to flow" +"\n\nSuddenly you feel a new sensation\nYou're worried you need an intervention\nAs you swoon, you lit up my affection\nFigure out what you want\n\nFinally you see your contradiction\nAnd blindly you loved my compensation\n\nNow let's destroy everything\nCome now let's get crazy");
        			msg("Now that your chained down like a dog go wild, lash back at me\nBefore you glare at reality --one more time-\nNow your feelings burst into 52 pieces there's one I want to find\nNow tell me where the Blackjack will hide\n\nCalmly I had noticed what your missing\nYour trying to fill your void with lusting\nBut all I can do is just pick you up you'll be alone tomorrow" + "\n\nFinally you get used to obeying\nJust trust me I always end up winning\nNow you have lost everything\n\nRight now you have cut yourself just chasing after fantasies\nNow before you fall apart inside --one more time-\nLook back on what you crushed the deck of cards that you just blew over\nThis song is just for you loser...");
        			M.home();
        		}if(x == 1){
        			M.home();
        		}
            
            b = false;
            }
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
        
	}
	

	
	public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        
        //if (type == LineEvent.Type.OPEN) {
        //    JOptionPane.showMessageDialog(null,"Playback started.");
             
        //} else if (type == LineEvent.Type.STOP) {
          //  playCompleted = true;
            //JOptionPane.showMessageDialog(null,"Playback completed.");
        //}
 
    }
}
