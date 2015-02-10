package stap07;

public class Album {
	
	private final String title;
	private final String artist;
	private final int sold;
	
	public Album(String title, String artist, int sold) {
		this.title = title;
		this.artist = artist;
		this.sold = sold;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getSold() {
		return sold;
	}
	
	
	
	
}
