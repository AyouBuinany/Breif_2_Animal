package API.Animaux.programme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	
	ArrayList<Animal> animals = new ArrayList<>();
	ArrayList<En_volant> En_volants= new ArrayList<>();
	Hourse hourse= new Hourse("Hourse","Audio/Horse-Angry-Neigh-And-Breathing-www.fesliyanstudios.com.wav");
	En_volants.add(hourse);
	String name="",audio="";
	for(En_volant anim: En_volants) {
		animals.add(anim);
	}
	
	Scanner input = new Scanner(System.in);
	

	
	while(true) {
		System.out.println("Read sound Hourse => 1 \n Read sound En_volants=>2 \n Read sound Animal=>3  ");
		int choix= input.nextInt();
	switch(choix) {
	case 1:
		 name=hourse.getName();
		 audio= hourse.getAudio();
		hourse.ReadSound(name, audio);
		break;
	case 2:
		for(En_volant anim: En_volants) {
			 name=anim.getName();
			 audio= anim.getAudio();
			anim.ReadSound(name, audio);
		}
		break;
	case 3: 
		for(Animal anims: animals) {
			 name=anims.getName();
			 audio= anims.getAudio();
			anims.ReadSound(name, audio);
		}
		break;
		default:
			
	}
	}
	}
	}
