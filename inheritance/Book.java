package basic_code;

public class Book extends WrittenItem {
	
	public Book(int idNo, String title, int noOfCopies, String author) {
		super(idNo, title, noOfCopies, author );
	}
		
	public void random() {
		System.out.println("This is inside Random function");
	
}		

}
