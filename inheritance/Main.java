package basic_code;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		item[] itemObj = new item[4];
		itemObj[0] =  new Book (1, "Physics", 45, "H C Verma");
		itemObj[1] = new JournalPaper(2, "Newyork Times",100, "XYZ", 2019);
		itemObj[2] = new Video (101, "Music", 5, 10,2018,"Director 1","Motivational");
		itemObj[3] = new CD (102, "Lectures",10, 15,"Artist 1", "Educational");
	
		
		for (int i=0; i<itemObj.length; i++){	
			  System.out.println( "Id No = " + itemObj[i].getId() +
	                    ", Title = " + itemObj[i].getTitle() +
	                    ", No of Copies = " + itemObj[i].getCopies());
		}
	}
}
