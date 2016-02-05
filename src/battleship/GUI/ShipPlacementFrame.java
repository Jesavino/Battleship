package battleship.GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import battleship.board.GameBoard;

public class ShipPlacementFrame {

	private GameBoard gameBoard;

	JFrame frame;

	public ShipPlacementFrame(GameBoard board) {
		gameBoard = board;

		frame = new JFrame("Ship Placement");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = 0.5 * screenSize.getWidth();
		double height = 0.5 * screenSize.getHeight();
		frame.setSize((int) width, (int) height);
		frame.setLocation((int) (0.5 * width), (int) (0.5 * height));

		frame.add(new GameBoardPane(board.getBoardWidth(), board.getBoardHeight()));
		frame.pack();

	}

	public void showFrame() {

		frame.setVisible(true);
	}

}
