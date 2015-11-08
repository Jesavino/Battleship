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
	
	abstract boolean isAlive();
	abstract boolean isDamaged();
	public abstract void shotFired(int cell);
	public abstract boolean hasBeenHit(int cell);
	public int getLengthOfShip() {
		return lengthOfShip;
	}
	public void setLengthOfShip(int lengthOfShip) {
		this.lengthOfShip = lengthOfShip;
	}

}