package com.Question_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Song NewSongObj = new Song();
		PlayList NewPlayList = new PlayList();
		
		Scanner sc = new Scanner(System.in);
		
		int i=0; 
		while(i<4) {
			String MovieName = sc.nextLine();
			String SongName = sc.nextLine();
			NewSongObj.setMovieName(MovieName);
			NewSongObj.setSongName(SongName);
			Song NewObj = new Song(MovieName,SongName);
			NewPlayList.addSong(NewObj);
			NewSongObj.play();
			
			i++;
		}
		
		System.out.println("Keshav");
	}
}
