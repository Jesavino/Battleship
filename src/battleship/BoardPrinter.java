package battleship;

/*
 * Responsible for printing the board
 * 
 * Example output for 4x4 board
 * 		 _ _ _ _
 * 		|S|_|_|_|
 * 		|S|_|_|_|
 * 		|_|_|_|_|
 * 		|_|_|_|_|
 * 
 * Key:
 * 		S = Ship
 * 		X = Hit
 * 		M = Miss
 */
public class BoardPrinter {
	
	static void printBoard(GameBoard board){
		int numRows = board.boardHeight;
		int numCols = board.boardWidth;
		ShipMap map[] = board.shipMaps;
		
		for (int i = 0 ; i <= numRows ; i++) {
			
			for (int j = 0 ; j < numCols ; j++) {
				if (i == 0)
					System.out.print(" _");
				else {
					if (j == 0)
						System.out.print("|");
					if (board.isCellOccupied(i-1, j)) {
						if (board.isCellHit(i - 1, j))
							System.out.print("X|");
						else
							System.out.print("S|");
					}
					else
						System.out.print("_|");
				}
			}
			System.out.print("\n");
		}
		
	}

}
