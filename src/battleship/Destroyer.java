package battleship;
/* ---------------------------------------------------------------
 * 
 * Destroyers are small fast, ships. They will have a size of two.
 * 
 * ---------------------------------------------------------------
 */
public class Destroyer extends GenericShip {

	public Destroyer() {
		lengthOfShip = 2;
		hitChart = new boolean[lengthOfShip];
		shipName = "Destroyer";
		
		for (int i = 0 ; i < hitChart.length ; i++) {
			hitChart[i] = false;
		}
	}
	boolean isAlive() {
		// TODO Auto-generated method stub
		for (int i  = 0 ; i < hitChart.length ; i++) {
			if (!hitChart[i])
				return true;
		}
		return false;
	}

	boolean isDamaged() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < hitChart.length ; i++) {
			if (hitChart[i]) {
				return true;
			}
		}
		return false;
	}

	void shotFired(int cell) {
		// TODO Auto-generated method stub
		hitChart[cell] = true;
	}
	@Override
	boolean hasBeenHit(int cell) {
		// TODO Auto-generated method stub
		return hitChart[cell];
	}

}
