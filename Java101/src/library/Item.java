package library;

public abstract class Item {
	

	String name;
	boolean isAvailable;
	int id;
	public Item(String name, boolean isAvailable, int id) {
		super();
		this.name = name;
		this.isAvailable = isAvailable;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
