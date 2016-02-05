package battleship.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import battleship.board.GameBoard;

/**
 * Shows the Board that is passed in. View is created with the constructer, and then should update when passed a board
 * @author Jesavino
 *
 */
// TODO: THink about instead creating a MapView object to be passed to the BoardPrinter class, which could reuse some
// of the code already written for console printing. 
public class MapViewer {
	JFrame frame;
	JPanel panel;
	JButton[] buttonList;
	
	private boolean mapImported = false;
	private int numButtons = 2;
	private GameBoard gameBoard;
	
	public MapViewer(GameBoard board) {
		// hold onto the gameBoard for later
		gameBoard = board;
		
		// frame setup
		frame = new JFrame("Battleship");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = 0.5 * screenSize.getWidth();
		double height = 0.5 * screenSize.getHeight();
		frame.setSize((int)width, (int)height);
		
		frame.setLocation((int) (0.5 * width), (int) (0.5 * height));
		
		// panel setup
		panel = new JPanel();
		
		// create the buttons
		buttonList = new JButton[numButtons];
		buttonList[0] = new JButton("Play Game");
		buttonList[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playButtonPressed();
			}
		});
		buttonList[1] = new JButton("Import Map");
		buttonList[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				importButtonPressed();
			}
		});
		panel.add(addButtons(buttonList));
		
		
		frame.add(panel);

	}
	public void showFrame() {
		
		frame.setVisible(true);
	}
	private JPanel addButtons(JButton[] buttonList) {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.setBorder(BorderFactory.createLineBorder(panel.getBackground(), 10));
		for (JButton button : buttonList) {
			panel.add(button);
			panel.add(Box.createVerticalStrut(15));
		}
		return panel;
	}
	private void playButtonPressed() {
		if (mapImported) {
			// goto play screen 
		}
		else {
			// load selection dialog
			ShipPlacementFrame spf = new ShipPlacementFrame(gameBoard);
			frame.dispose();
			spf.showFrame();
		}
	}
	// TODO: handle map import, maybe via csv, or just a text document?
	private void importButtonPressed() {
		// import a map
		
		//if it succeed, mapImported = true;
	}
}
