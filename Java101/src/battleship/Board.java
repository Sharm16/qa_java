package battleship;

import java.util.Scanner;

public class Board {

	int playerBoard[][];
	int computerBoard[][];
	public void createBoard() {
		System.out.println("What size width would you like the board to be? It should be between 2 and 15");
		Scanner w = new Scanner(System.in);
		int width = w.nextInt();

		System.out.println("What size height would you like the board to be? it should be bewtween 2 and 15");
		Scanner h = new Scanner(System.in);
		int height = h.nextInt();

		playerBoard = new int[width][height];
		computerBoard = new int[width][height];

		if (width < 16 && width > 1 && height < 16 && height > 1) {
			System.out.println("You have a board size of " + width + " by " + height + "\nYour board has "
					+ width * height + " spaces");

		} else {
			System.out.println("Your values are out not between 2 and 15");
			createBoard();
			w.close();
			h.close();
		}

	}
	public int[][] getPlayerBoard() {
		return playerBoard;
	}
	public void setPlayerBoard(int[][] playerBoard) {
		this.playerBoard = playerBoard;
	}
	public int[][] getComputerBoard() {
		return computerBoard;
	}
	public void setComputerBoard(int[][] computerBoard) {
		this.computerBoard = computerBoard;
	}



}
