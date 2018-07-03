package library;

import java.util.ArrayList;

public class Storage {

	ArrayList<Item> Items;

	public Storage() {

		

		Items = new ArrayList<Item>();
		

	}

	public  void addBook(String name, boolean isAvailable, int id, String genre, String author) {
		Item item = new Book(name, isAvailable, id, genre, author);
		Items.add(item);
	}

	public  void addMap(String name, boolean isAvailable, int id, String location) {
		Item item = new Map(name, isAvailable, id, location);
		Items.add(item);
	}

	public  void addMagazine(String name, boolean isAvailable, int id, String publisher) {
		Item item = new Magazine(name, isAvailable, id, publisher);
		Items.add(item);
	}

	public  void removeItem(String name) {
		for (int i = 0; i < Items.size(); i++) {
			if (Items.get(i).name.matches(name)) {
				Items.remove(i);
			}
		}
	}

	public  void updateItemName(int id, String name) {
		for (int i = 0; i < Items.size(); i++) {
			if (Items.get(i).id == id) {
				
				
				
				
				
				
				Items.set(i, element)
				
				Items.get(i).setName(name);
				
				
				
				Book b1 = (Book) Items.get(i);
				
//				.setName(name)
				
				b1.setName(name);
				
				System.out.println(b1.getName());
				
				System.out.println(Items.get(i).name);
				
				System.out.println(name + "igkihj");

			}
		}
	}

	public void add(Item item) {
		Items.add(item);
		
	}

}