package Vehicle;

public class Vehicle {

	
	public int speed;
	public int cost;


	public int getSpeed() {
		return speed;
	}

	public int getCost() {
		return cost;
	}

}

class Car extends Vehicle {
	public int noOfSeats;

	public Car(int maxSpeed, int price, int seats) {

		
		this.speed = maxSpeed;
		this.cost = price;
		this.noOfSeats = seats;

	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public String toString() {

		return (speed + " " + cost + " " + noOfSeats);

	}
}

class Boat extends Vehicle {

	public int propelers;

	public Boat(int maxSpeed, int price, int propeler) {

		this.speed = maxSpeed;
		this.cost = price;
		this.propelers = propeler;

	}

	public int getPropelers() {
		return propelers;
	}

	public String toString() {

		return (speed + " " + cost + " " + propelers);

	}
}

class Bus extends Vehicle {
	int number;
	public int psng;

	public Bus(int maxSpeed, int price, int busNo, int passengers) {

		this.speed = maxSpeed;
		this.cost = price;
		this.psng = passengers;
		this.number = busNo;

	}

	public int getNumber() {
		return number;
	}

	public int getPsng() {
		return psng;
	}

	public String toString() {

		return (speed + " " + cost + " " + psng);

	}
}
