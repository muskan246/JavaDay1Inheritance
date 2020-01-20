package basic_code;

public abstract class MediaItem extends item {
	private int runtime;
	public MediaItem(int idNo, String title, int noOfCopies, int runtime) {
		super(idNo, title, noOfCopies);
		this.runtime = runtime;
		
	}
	
	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public abstract void random();
	public void equals() {
		System.out.println("This is inside Equals function");
	
}

}
