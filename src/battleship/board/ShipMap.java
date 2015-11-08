package battleship.board;

import java.awt.Point;
/*
 * Class which maps a ship to to a set of coordinates. 
 * At the moment we operate under the assumption that 
 * ships are only linear
 * 
 * The ship map needs the board in order to mark the game cells. The ship map only tracks positioning
 * of ships, the game cells themselves are responsible for hit / miss tracking and the ship is responsible
 * for knowing when it is destroyed. 
 */

import battleship.ships.GenericShip;

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
	public GenericShip getShip() {
		return ship;
	}
	/**
	 * Gets the index into the ship based on the passed in point
	 * @param point the point that needs to be indexed
	 * @return The index into the ship
	 */
	public int getShipIndex(Point point) {
		Point tempPoint;
		if (startPos.x == endPos.x) {
			// must be horizontal
			for (int i = startPos.y , j = 0; i <= endPos.y ; i++, j++) {
				tempPoint = new Point(startPos.x, i);
				if (tempPoint.equals(point))
					return j;
			}
		}
		else if (startPos.y == endPos.y) {
			// must be vertical
			for (int i = startPos.x, j = 0; i <= endPos.x ; i++, j++) {
				tempPoint = new Point(i , startPos.y);
				if (tempPoint.equals(point))
					return j;
			}
		}
		else { // must be diagonal 
			for (int i = startPos.x, j = startPos.y , z = 0; i <= endPos.x ; i++, j++, z++) {
				tempPoint = new Point(i , j);
				if (tempPoint.equals(point))
					return z;
			}
			
		}
		return -1;
	}
	// marks the ships on the GameCell map as being occupied
	// currently does diagonal ships
	private void markShips(Point start, Point end, GenericShip newShip, GameCell[][] board) {
		// check if vertical or horizontal
		if (start.x == end.x ) {
			// must be horizontal
			for (int i = start.y ; i <= end.y ; i++) {
				board[start.x][i].addShip(newShip);
			}
		}
		else if (start.y == end.y){
			// vertical
			for (int i = start.x ; i <= end.x ; i++) {
				board[i][start.y].addShip(newShip);
			}
		}
		else { //must be diagonal
			for (int i = start.x, j = start.y; i <= end.x ; i++, j++) {
				board[i][j].addShip(newShip);
			}
		}
	}
	
	
}
