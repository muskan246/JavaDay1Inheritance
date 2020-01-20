package basic_code;

public abstract class WrittenItem extends item {
	private String author;
	
	public WrittenItem(int idNo, String title, int noOfCopies, String author) {
		super(idNo, title, noOfCopies);
		this.author = author;
		
	}
	public abstract void random();
	
	public String getAuthor() {
	        return author;
	    }
	
	public void equals() {
			System.out.println("This is inside Equals function");
		
	}
	
	 
}
