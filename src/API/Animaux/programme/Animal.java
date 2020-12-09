package API.Animaux.programme;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private String audio;
	private String name;
	public Animal(String name,String audio) {
		this.name=name;
		this.audio=audio;
	}
	public String getAudio() {
		return this.audio;
	}
	public void setAudio(String audio) {
		this.audio=audio;
	}
	
	public String getName() {
		return this.name;
	}
	public void getName(String name) {
		this.name=name;
	}
	//
	public void ReadSound(String effectSource,String audio) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(audio));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource+" sound is start ! ");
		System.out.println("s : "+clip.isActive());
		while(clip.isActive()) {
			//System.out.println("hola "+effectSource);
			}
			clip.close();
				System.out.println(effectSource+" sound is end ! ");
			}
}
