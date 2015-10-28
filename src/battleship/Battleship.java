package battleship;

import java.awt.Point;

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
		Point start = new Point(0,0);
		Point end = new Point(0,1);
		Destroyer destroyer = new Destroyer();
		if (board.addShip(start, end, destroyer))
			BoardPrinter.printBoard(board);
		else
			System.out.println("Error in adding ship!");
		System.exit(0);
	}

}
