package battleship;

import java.awt.Point;

import battleship.GUI.MapViewer;
import battleship.board.GameBoard;
import battleship.placement.TestShipPlacement;
import battleship.ships.*;

/**
 * Driver for battleship program. 
 * @author Jesavino
 *
 */
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WOrking example to play with the back end
		GameBoard board = new GameBoard(5,5,4);
		BoardPrinter.printBoard(board);
		
		Destroyer destroyer = new Destroyer();
		Cruiser cruiser = new Cruiser();
		BattleshipShip battleship = new BattleshipShip();
		Carrier carrier = new Carrier();
		
		GenericShip[] ships = {destroyer, cruiser, battleship, carrier};
		
		TestShipPlacement tsp = new TestShipPlacement();
		tsp.addShips(ships, board);
		BoardPrinter.printBoard(board);
		
		// create a game thread
		GameThread t = new GameThread(board);
		Thread thread = new Thread(t);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
			
		
		/*/ The start of a GUI. Long way to go here. 
		MapViewer view = new MapViewer();
		view.showFrame(); */
		System.exit(0);
		
	}

}
