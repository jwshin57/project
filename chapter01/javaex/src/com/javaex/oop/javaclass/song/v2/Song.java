package com.javaex.oop.javaclass.song.v2;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	//전체 필드를 세팅하는 생성자
	public Song(String title,
			String artist,
			String album,
			String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track =track;
		
	
	//생성자추가
	//title setter/getter
//	void setTitle(String title) {
//		this.title = title;
		
	}
	
	String getTitle() {
		return title;
		
	}
	// artist setter / getter
//	void setArtist(String artist) {
//		this.artist = artist;
//	}
	String getArtist() {
		return artist;
	}
	
	//	album setter/getter
//	void setAlbum(String album) {
//		this.album = album;
		
		
//	}
	String getAlbum() {
		return album;
		
	}
	//composer setter/getter
//	void setComposer(String composer) {
//		this.composer = composer;
//	}
	String getComposer() {
		return composer;
		
	}
	//year setter/getter
//	void setYear(int year) {
//		this.year = year;
//	}
	int getYear() {
		return year;
		}
//	//track setter/getter
//	void setTrack(int track) {
//		this.track = track;
//		
//	}
	int getTrack() {
		return track;
	
	}
	void showInfo() {
		System.out.printf("%s, %s ( %s %d, %d번 track %s 작곡 )%n"
				, artist
				, title
				, album
				, year
				, track
				, composer);
		
	}
	
}
