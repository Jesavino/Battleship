package battleship;

import java.awt.Point;

// tests ship placement
public class TestShipPlacement implements ShipPlacement {

	/**
	 * Adds ships to the game board. This is a real simple algorithm which just 
	 * adds the ship to the board left aligned. Requires the board to have enough 
	 * rows to support the number of ships. 
	 */
	public boolean addShips(GenericShip[] ships, GameBoard board) {
		// TODO Auto-generated method stub
		Point start, end;
		
		if (ships.length > board.boardHeight) {
			System.out.println("Error: More ships than board height.");
			return false;
		}
		for (int i = 0 ; i < ships.length ; i++) {
			start = new Point(i , 0 );
			end = new Point( i , ships[i].lengthOfShip);
			board.addShip(start,  end , ships[i]);
		}
		return true;
	}

}
