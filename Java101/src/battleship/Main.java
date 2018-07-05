package battleship;

public class Main {

	public static void main(String[] args) {
		
		Board b = new Board();
		
		b.createBoard();
		
		Ship.placeShip(ShipType.BATTLESHIP, b);
		
		
		Ship s = new Ship("j", 4, 4, 4, 4);
		
		s.place("igh",b);
		
		

	}

}
