package basic_code;

public class JournalPaper extends WrittenItem {
	private int publishedYear;
	
	public JournalPaper(int idNo, String title, int noOfCopies, String author, int publishedYear) {
		super(idNo, title, noOfCopies,author);
		this.publishedYear = publishedYear;
		
	}
	public void random() {
		System.out.println("This is inside Random function");
	
}


}
