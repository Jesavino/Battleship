package battleship;

/**
 * Master abstract class for genericly creating ships
 * @author Jesavino
 *
 */
public abstract class GenericShip {

	int lengthOfShip;
	boolean hitChart[];
	String shipName;
	
	abstract boolean isAlive();
	abstract boolean isDamaged();
	abstract void shotFired(int cell);
	abstract boolean hasBeenHit(int cell);

}