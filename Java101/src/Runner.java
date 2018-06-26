public class Runner {

	public static void main(String[] args) {
		Person Person1 = new Person("sharm", 22, "It conultant");
		Person Person2 = new Person("Bob", 25, "analyst");
		Person Person3 = new Person("Charlie", 25, "analyst");

		PersonManager pm = new PersonManager(Person1, Person2, Person3);
		// creating a variable of type PersonManager called pm, with parameters from the constructor
		
		
		//System.out.println(pm.search("sharm"));
		pm.print();
	}
}
