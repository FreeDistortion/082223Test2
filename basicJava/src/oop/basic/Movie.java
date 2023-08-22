package oop.basic;

public class Movie {
	private String title;
	private String genre;
	
	public void play() {
		System.out.println(title+"("+genre+")"+" 상영중입니다.");
	}
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setGenre(String genre) {
		this.genre=genre;
	}
	public String getGenre() {
		return genre;
	}
	
}
