package basic_code;

public abstract class item {
	private int idNo;
	private String title;
	private  int noOfCopies;
	
	public item (int idNo, String title, int noOfCopies) {
		this.idNo = idNo;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	
	
	//getter function for ID
	public int getId () {
		return this.idNo;
	}
	//getter function for title
		public String getTitle () {
			return this.title;
		}
	//getter function for noOfCopies
		public int getCopies () {
			return this.noOfCopies;
		}
	
	//setter function
		public void setValues(int idNo, String title, int noOfCopies) {
			this.idNo = idNo;
			this.title = title;
			this.noOfCopies = noOfCopies;
			
		}
	
	// equals function which is abstract
		public abstract void equals();
		
		
		public void tostring()
		{
			System.out.println("This is inside toString function");
		}
		
		public void print()
		{
			System.out.println("Unique ID: "+idNo);
			System.out.println("Title: "+title);
			System.out.println("No of Copies: "+noOfCopies);
		}
		
		public void checkIn(int checkinCopies) {
			noOfCopies -= checkinCopies;

		}
		
		public  void checkOut(int checkoutCopies)
		{
			noOfCopies += checkoutCopies;
		}
	

}

