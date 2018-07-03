package library;

public class runner {

	public static void main(String[] args) {
		
		Storage s =new Storage();
	
		Item book1 = new Book("Guide to SQL", true, 100, "Educational", "Shafeeq");
		Item book2 = new Book("Guide to Java", true, 101, "Educational", "Matt");
		Item map1 = new Map("Map of Manchester", true, 98, "Manchester");
		Item magazine1 = new Magazine("Daily Qa", false, 58, "Qa Consulting");
		
		s.add(book1);
		s.add(book2);
		s.add(map1);
		s.add(magazine1);

	}

}
