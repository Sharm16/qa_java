package battleship;

import java.util.ArrayList;
import java.util.Scanner;

public class Ship {

	private String type;
	private static int size;
	private int startLocationX;
	private int endLocationX;
	private int startLocationY;
	private int endLocationY;
	static ArrayList<Ship> shipList = new ArrayList<Ship>();

	public Ship(String type, int startLocationX, int endLocationX, int startLocationY, int endLocationY) {
		this.type = type;
		this.startLocationX = startLocationX;
		this.endLocationX = endLocationX;
		this.startLocationY = startLocationY;
		this.endLocationY = endLocationY;
	}

	public static void placeShip(ShipType type, Board b) {

		switch (type) {

		case BATTLESHIP:
			size = 3;
			place("Battleship", b);

			break;

		case CARRIER:
			size = 5;
			place("Carrier", b);

			break;

		case DESTROYER:
			size = 4;
			place("Destroyer", b);

			break;

		case PATROLBOAT:
			size = 2;
			place("Patrol Boat", b);
			break;

		case SUBMARINE:
			size = 3;
			place("Submarine", b);
			break;

		default:
			System.out.println("Not a Ship");
			break;

		}
	}

	public static void place(String name, Board b) {

		System.out.println("Where would you like to place your boat? Type an x Coordinate");
		Scanner xs = new Scanner(System.in);
		int startX = xs.nextInt();
		System.out.println("Where would you like to place your boat? Type an y Coordinate");
		Scanner ys = new Scanner(System.in);
		int startY = ys.nextInt();
		System.out.println("Which way would you like your boat to face. Type up, down ,left or right");
		Scanner direction = new Scanner(System.in);
		String d = direction.next();

		int endX = 0;
		int endY = 0;

		if (d.matches("up")) {

			endX = startX;
			endY = startY + size;

		}
		if (d.matches("down")) {
			endX = startX;
			endY = startY - size;

		}
		if (d.matches("left")) {
			endX = startX - size;
			endY = startY;

		}
		if (d.matches("right")) {
			endX = startX + size;
			endY = startY;

		} else {
			System.out.println("That is not a direction");
			place(name, b);
		}

		Ship ship = new Ship(name, startX, endX, startY, endY);
		shipList.add(ship);

		// fill out array with take spaces
		for (int x = 0; x < b.getPlayerBoard().length; x++) {
			for (int y = 0; y < b.getPlayerBoard().length; y++) {
				if (b.getPlayerBoard()[x][y] == (0)) {
					//
					b.getPlayerBoard()[x][y] = 1;
					System.out.println("X");

				} else {
					System.out.println("Cannot place a boat here. You have already placed a boat here.");
				}

			}
		}
		ys.close();
		xs.close();
		direction.close();

	}

}