package basic_code;

public class Video extends MediaItem {
	private int year;
	private String director;
	private String genre;

	public Video(int idNo, String title, int noOfCopies, int runtime, int year, String director, String genre) {
		super(idNo, title, noOfCopies, runtime);
		this.year = year;
		this.director = director;
		this.genre = genre;
		
	}
	public void random() {
		System.out.println("This is inside Random function");
	
}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}		
	
}
