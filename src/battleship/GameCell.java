package battleship;

import java.awt.Point;

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
	 * @param shipMaps 
	 * @return True if the ship was hit, False otherwise
	 */
	public boolean shotAt(ShipMap[] shipMaps) {
		if (isOccupied) {
			// need to fire at the ship. Get correct ship map, then calculate position
			
			Point point = new Point(xPos, yPos);
			ship.shotFired(getMatchingShipMap(shipMaps).getShipIndex(point));
			return true;
		}
		else
			return false;
	}
	public boolean containsShip() {
		return isOccupied;
	}

	public boolean isHit(ShipMap[] shipMaps) {
		// TODO Auto-generated method stub
		Point point = new Point(xPos, yPos);
		return ship.hasBeenHit(getMatchingShipMap(shipMaps).getShipIndex(point));

	}
	private ShipMap getMatchingShipMap(ShipMap[] shipMaps) {
		for (int i = 0 ; i < shipMaps.length ; i++) {
			if (shipMaps[i].getShip() != null && shipMaps[i].getShip() == ship) {
				return shipMaps[i];
			}
		}
		return null;
	}
}
