package Vehicle;

import java.util.ArrayList;

public class Garage {

	static ArrayList<Vehicle> garage;

	public Garage() {

		Car car1 = new Car(100, 20000, 5);
		Boat boat1 = new Boat(30, 15000, 2);
		Bus bus1 = new Bus(30, 30000, 198, 50);

		// ArrayList<Vehicle> garage =new ArrayList<>();
		garage = new ArrayList<>();
		garage.add(car1);
		garage.add(boat1);
		garage.add(bus1);
		// System.out.println(garage);
		
	//	System.out.println(boat1.getClass().getSimpleName();
		
		

	}

//	public static double bill(Vehicle vehicle) {
//		if (vehicle.equals("Car")) {
//			return vehicle.cost * 0.1;
//		} else if (vehicle.equals("Bus")) {
//			return vehicle.cost * 0.2;
//		} else
//			return vehicle.cost * 0.3;
//	}

	public static void billAll(ArrayList<Vehicle> garage) {
		for (int i = 0; i < garage.size(); i++) {
			if (garage.get(i).getClass().getSimpleName().equals("Car")) {
				System.out.println(garage.get(i).cost * 0.1);
			} else if (garage.get(i).getClass().getSimpleName().equals("Bus")) {
				System.out.println(garage.get(i).getCost() * 0.2);
			} else
				System.out.println(garage.get(i).cost * 0.3);
		}

	}

	public static void addCar(Vehicle v) {
		garage.add(v);
		System.out.println(garage);
	}

	public static void removeCar(Vehicle v) {

		garage.remove(v);
		System.out.println(v + "b has been removed");

	}
	
	public static void emptyGarage() {
		garage.clear();
		System.out.println("Garage is now empty");
	}


}

