package com.Question_2;

import java.util.List;
import java.util.ArrayList;

public class PlayList {

	public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song){
        
        for(Song i : songs) {
        	if(i.getSongName().equals(song))
        		System.out.println("Song is already added in the playlist");
			return;
        }
        
		songs.add(song);
		System.out.println("Song added to the playlist successfully.");
	}
	
}
