package battleship.placement;

import battleship.board.GameBoard;
import battleship.ships.GenericShip;

/**
 * Interface for ship placement
 * @author Jesavino
 *	
 */
public interface ShipPlacement {

	public boolean addShips(GenericShip[] ships, GameBoard board);
}
