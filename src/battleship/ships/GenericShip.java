package battleship.ships;

/**
 * Master abstract class for genericly creating ships
 * @author Jesavino
 *
 */
public abstract class GenericShip {

	private int lengthOfShip;
	boolean hitChart[];
	String shipName;
	
	boolean isAlive() {
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
	public void shotFired(int cell) {
		hitChart[cell] = true;
	}
	
	public boolean hasBeenHit(int cell) {
		return hitChart[cell];
	}
	public int getLengthOfShip() {
		return lengthOfShip;
	}
	public void setLengthOfShip(int lengthOfShip) {
		this.lengthOfShip = lengthOfShip;
	}

}