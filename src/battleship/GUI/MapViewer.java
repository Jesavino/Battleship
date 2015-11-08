package battleship.GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Shows the Board that is passed in. View is created with the constructer, and then should update when passed a board
 * @author Jesavino
 *
 */
// TODO: THink about instead creating a MapView object to be passed to the BoardPrinter class, which could reuse some
// of the code already written for console printing. 
public class MapViewer {
	JFrame frame;
	
	public MapViewer() {
		frame = new JFrame("Battleship");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = 0.5 * screenSize.getWidth();
		double height = 0.5 * screenSize.getHeight();
		frame.setSize((int)width, (int)height);
		
		frame.setLocation((int) (0.5 * width), (int) (0.5 * height));

	}
	public void showFrame() {
		
		frame.setVisible(true);
	}
}
