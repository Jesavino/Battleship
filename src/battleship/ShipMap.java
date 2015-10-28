package battleship;

import java.awt.Point;
/*
 * Class which maps a ship to to a set of coordinates. 
 * At the moment we operate under the assumption that 
 * ships are only linear
 */

public class ShipMap {

	private Point startPos, endPos;
	private GenericShip ship;
	
	public ShipMap() {
		// we default the map to (-1, -1);
		startPos = endPos = new Point(-1, -1);
		ship = null;
	}
	
	public void addShip(Point start , Point end, GenericShip newShip, GameBoard board) {
		startPos = start;
		endPos = end;
		ship = newShip;
		markShips(start, end, newShip, board.board);
		
	}
	
	public boolean isEmpty() {
		if (startPos.x == -1 || startPos.y == -1 ||
				endPos.x == -1 || endPos.y == -1) {
			return true;
		}
		return false;
	}
	// marks the ships on the GameCell map as being occupied
	// currently does not support diagonal ships, but that should be easy to add
	private void markShips(Point start, Point end, GenericShip newShip, GameCell[][] board) {
		// check if vertical or horizontal
		if (start.x == end.x ) {
			// must be horizontal
			for (int i = start.y ; i <= end.y ; i++) {
				board[start.x][i].addShip(newShip);
			}
		}
		else {
			// vertical
			for (int i = start.x ; i < end.x ; i++) {
				board[i][start.y].addShip(newShip);
			}
		}
	}
	
	
}
