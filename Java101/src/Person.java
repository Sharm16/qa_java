import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private String Job;

	public Person(String name, int age, String Job) {

		this.name = name;
		this.age = age;
		this.Job = Job;
		//System.out.println("Person name is " + name + " age is " + age + " Job is " + Job);
	}

	
	public String getName() {
		return name;
	}

	public String toString() {
		return ("Person name : " + name + " age : " + age + " Job : " + Job);
	}

}
