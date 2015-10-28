package battleship;

import java.awt.Point;

/**
 * The board the game plays on. There will be two of these, one per player. 
 * @author Jesavino
 *
 */
public class GameBoard {

	int boardWidth, boardHeight;
	int numShips;
	GameCell[][] board;
	ShipMap[] shipMaps;
	
	public GameBoard(int width, int height, int numberOfShips) {
		boardWidth = width;
		boardHeight = height;
		
		// initialize the board
		board = new GameCell[boardWidth][boardHeight];
		for (int i = 0 ; i < boardWidth ; i++) {
			for (int j = 0 ; j < boardHeight ; j++) {
				board[i][j] = new GameCell(i, j);
			}
		}
		
		// initialize the ship maps
		numShips = numberOfShips;
		shipMaps = new ShipMap[numShips];
		for (int i  = 0 ; i < numShips ; i ++) 
			shipMaps[i] = new ShipMap();
		
	}
	
	public boolean addShip(Point start, Point end, GenericShip ship) {
		
		for (int i = 0 ; i < shipMaps.length ; i++) {
			// if the ship map in this position is empty, us it to map the added ship
			if (shipMaps[i].isEmpty()) {
				shipMaps[i].addShip(start, end, ship, this);
				return true;
			}
		}
		return false;
		
	}
	public boolean isCellOccupied(int x, int y) {
		return board[x][y].containsShip();
	}
}
