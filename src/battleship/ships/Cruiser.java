package battleship.ships;

public class Cruiser extends GenericShip {

	public Cruiser() {
		setLengthOfShip(3);
		hitChart = new boolean[getLengthOfShip()];
		shipName = "Cruiser";
		
		for (int i = 0 ; i < hitChart.length ; i++) {
			hitChart[i] = false;
		}
	}

}
