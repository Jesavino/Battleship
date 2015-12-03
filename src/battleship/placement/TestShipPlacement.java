package battleship.placement;

import java.awt.Point;

import battleship.board.GameBoard;
import battleship.ships.GenericShip;

// tests ship placement
public class TestShipPlacement implements ShipPlacement {

	
	public TestShipPlacement() {
		// null constructor 
	}
	
	/**
	 * Adds ships to the game board. This is a real simple algorithm which just 
	 * adds the ship to the board left aligned. Requires the board to have enough 
	 * rows to support the number of ships. 
	 */
	public boolean addShips(GenericShip[] ships, GameBoard board) {
		// TODO Auto-generated method stub
		Point start, end;
		
		if (ships.length > board.getBoardHeight()) {
			System.out.println("Error: More ships than board height.");
			return false;
		}
		for (int i = 0 ; i < ships.length ; i++) {
			start = new Point(i , 0 );
			end = new Point( i , ships[i].getLengthOfShip() - 1);
			board.addShip(start,  end , ships[i]);
		}
		return true;
	}

}
