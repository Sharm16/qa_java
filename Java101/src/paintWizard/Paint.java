package paintWizard;

public class Paint {

	private String name;
	private int size;
	private double cost;
	private double area;

	public Paint(String name, int size, double cost, double area) {
		this.name = name;
		this.size = size;
		this.cost = cost;
		this.area = area;
	}

	public void toString(String name, int size, double cost, double area) {

		System.out.println(name + " " + size + " " + cost + " " + area);
	}
}
