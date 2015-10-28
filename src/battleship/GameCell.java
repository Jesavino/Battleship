package battleship;

/**
 * The board is made up or these game cells
 * @author Jesavino
 *
 */
public class GameCell {

	int xPos , yPos;
	boolean isOccupied;
	GenericShip ship;
	
	public GameCell(int x , int y) {
		isOccupied = false;
		xPos = x;
		yPos = y;
	}
	
	public boolean addShip(GenericShip newShip) {
		if (isOccupied)
			return false;
		else {
			ship = newShip;
			isOccupied = true;
		}
		return true;
	}
	/**
	 * Method for handling the firing at a specific cell
	 * @return True if the ship was hit, False otherwise
	 */
	public boolean shotAt() {
		if (isOccupied) {
			// need to fire at the ship
			return true;
		}
		else
			return false;
	}
	public boolean containsShip() {
		return isOccupied;
	}
}
