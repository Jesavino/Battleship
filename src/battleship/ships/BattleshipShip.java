package battleship.ships;

public class BattleshipShip extends GenericShip {
	public BattleshipShip() {
		setLengthOfShip(4);
		hitChart = new boolean[getLengthOfShip()];
		shipName = "Battleship";
		
		for (int i = 0 ; i < hitChart.length ; i++) {
			hitChart[i] = false;
		}
	}

}
