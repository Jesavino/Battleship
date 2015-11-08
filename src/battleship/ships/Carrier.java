package battleship.ships;

public class Carrier extends GenericShip {
	public Carrier() {
		setLengthOfShip(5);
		hitChart = new boolean[getLengthOfShip()];
		shipName = "Carrier";
		
		for (int i = 0 ; i < hitChart.length ; i++) {
			hitChart[i] = false;
		}
	}
}
