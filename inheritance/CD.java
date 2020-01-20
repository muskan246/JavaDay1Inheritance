package basic_code;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	

	public CD(int idNo, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(idNo, title, noOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
		
	}
	public void random() {
		System.out.println("This is inside Random function");
	
}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
