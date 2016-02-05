package battleship.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

/**
 * Modified code from stackoverflow link below
 * @author http://stackoverflow.com/questions/15421708/how-to-draw-grid-using-swing-class-java-and-detect-mouse-position-when-click-and
 *
 */
public class GameCellPane extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color defaultBackground;

    public GameCellPane() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                defaultBackground = getBackground();
                setBackground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultBackground);
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(50, 50);
    }
}