package battleship.ships;

public class Battleship extends GenericShip {
	public Battleship() {
		setLengthOfShip(4);
		hitChart = new boolean[getLengthOfShip()];
		shipName = "Battleship";
		
		for (int i = 0 ; i < hitChart.length ; i++) {
			hitChart[i] = false;
		}
	}

}
