package battleship.board;

import java.awt.Point;

import battleship.ships.GenericShip;

/**
 * The board the game plays on. There will be two of these, one per player. 
 * @author Jesavino
 *
 */
public class GameBoard {

	private int boardWidth;
	private int boardHeight;
	int numShips;
	GameCell[][] board;
	private ShipMap[] shipMaps;
	
	public GameBoard(int width, int height, int numberOfShips) {
		setBoardWidth(width);
		setBoardHeight(height);
		
		// initialize the board
		board = new GameCell[getBoardWidth()][getBoardHeight()];
		for (int i = 0 ; i < getBoardWidth() ; i++) {
			for (int j = 0 ; j < getBoardHeight() ; j++) {
				board[i][j] = new GameCell(i, j);
			}
		}
		
		// initialize the ship maps
		numShips = numberOfShips;
		setShipMaps(new ShipMap[numShips]);
		for (int i  = 0 ; i < numShips ; i ++) 
			getShipMaps()[i] = new ShipMap();
		
	}
	
	public boolean addShip(Point start, Point end, GenericShip ship) {
		
		for (int i = 0 ; i < getShipMaps().length ; i++) {
			// if the ship map in this position is empty, us it to map the added ship
			if (getShipMaps()[i].isEmpty()) {
				getShipMaps()[i].addShip(start, end, ship, this);
				return true;
			}
		}
		return false;
		
	}
	public boolean isCellOccupied(int x, int y) {
		return board[x][y].containsShip();
	}
	public boolean isCellHit(int x, int y) {
		return board[x][y].isHit(getShipMaps());
	}
	/**
	 * Fire's at the entered row and column
	 * @param row the row fired at
	 * @param col the column fired at
	 * @return True if hit, false if missed
	 */
	public boolean fireAt(int row, int col) {
		// get the correct ship map to send to the GameCell
		
		return board[row][col].shotAt(getShipMaps());		
	}

	public int getBoardHeight() {
		return boardHeight;
	}

	public void setBoardHeight(int boardHeight) {
		this.boardHeight = boardHeight;
	}

	public int getBoardWidth() {
		return boardWidth;
	}

	public void setBoardWidth(int boardWidth) {
		this.boardWidth = boardWidth;
	}

	public ShipMap[] getShipMaps() {
		return shipMaps;
	}

	public void setShipMaps(ShipMap[] shipMaps) {
		this.shipMaps = shipMaps;
	}
}
