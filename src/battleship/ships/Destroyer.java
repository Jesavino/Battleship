package battleship.ships;

/* ---------------------------------------------------------------
 * 
 * Destroyers are small fast, ships. They will have a size of two.
 * 
 * ---------------------------------------------------------------
 */
public class Destroyer extends GenericShip {

	public Destroyer() {
		setLengthOfShip(2);
		hitChart = new boolean[getLengthOfShip()];
		shipName = "Destroyer";
		
		for (int i = 0 ; i < hitChart.length ; i++) {
			hitChart[i] = false;
		}
	}
}
