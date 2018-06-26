import java.util.ArrayList;

public class PersonManager {
	ArrayList<Person> people;

	public PersonManager(Person Person1, Person Person2, Person Person3) {
		// creating the constructor with the parameters

		//people = new ArrayList<>();
		people.add(Person1);
		people.add(Person2);
		people.add(Person3);
	}

	public void print(ArrayList people) {
		for (Object p : people) {
			System.out.println(p);

		}
	}

	public Person search(String name) {

		for (Person p : people) {

			if (p.getName().equals(name)) {
				return p;

			}
		}
		return null;

	}
}