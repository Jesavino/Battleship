package battleship;

public class CLShipPlacement implements ShipPlacement {

	public boolean addShips(GenericShip[] ships, GameBoard board) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < ships.length ; i++) {
			BoardPrinter.printBoard(board);
			
			//System.out.printf("Where would you like to put your %s of length %f?\n" ,  ships[i].shipName ,ships[i].lengthOfShip);
			
			
		}
		return false;
	}

}
