package battleship;

import java.util.Scanner;

import battleship.board.GameBoard;

public class GameThread implements Runnable{

	GameBoard gameBoard;
	static Scanner console;
	
	/** 
	 * GameThread constructor to set the thread up with the board to be
	 * shot at
	 */
	public GameThread(GameBoard board) {
		gameBoard = board;
		console = new Scanner(System.in);
	}
	
	public void run() {
		
		// while all ships are not yet destroyed
		while( ! gameBoard.allShipsDestroyed() ) {
			
			// prompt the user for input
			System.out.print("Enter a row to fire at: ");
			int row = console.nextInt();
			System.out.print("Enter a column to fire at: ");
			int column = console.nextInt();
			System.out.printf("Now firing at %d , %d\n", row, column);
			
			if (row == 15) {
				System.exit(0);
			}
		}
		
	}
}
