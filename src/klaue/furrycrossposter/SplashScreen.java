package klaue.furrycrossposter;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A simple loading window. For a splash screen use klaue's version of this class.
 * @author libertyernie
 *
 */
public class SplashScreen extends JFrame implements Runnable {
	private static final long serialVersionUID = -8894852931512296126L;

	public SplashScreen() {
		this.setTitle("Crosspost Mini");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.add(mainPanel);
		
		mainPanel.add(new JLabel("Loading..."));
		
		setResizable(false);
		setMinimumSize(new Dimension(300, 1));
		pack();

        setLocationRelativeTo(null);
	}

	@Override
	public void run() {
		setVisible(true);
	}
	
	public void stop() {
		if (this.isVisible()) {
			setVisible(false);
			dispose();
		}
	}
}
