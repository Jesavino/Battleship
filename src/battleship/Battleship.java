package battleship;

import java.awt.Point;

import battleship.board.GameBoard;
import battleship.ships.Destroyer;

/**
 * Driver for battleship program. 
 * @author Jesavino
 *
 */
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameBoard board = new GameBoard(5,5,4);
		BoardPrinter.printBoard(board);
		Point start = new Point(2,2);
		Point end = new Point(3,3);
		Destroyer destroyer = new Destroyer();
		if (board.addShip(start, end, destroyer))
			BoardPrinter.printBoard(board);
		else
			System.out.println("Error in adding ship!");
		
		if (board.fireAt(2, 2))
			BoardPrinter.printBoard(board);
		else
			System.out.println("Error firing at cell");
		System.exit(0);
	}

}
