package klaue.furrycrossposter;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
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
		this.setTitle("CrosspostSharp EFC");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		this.add(mainPanel);

		mainPanel.add(new JLabel(this.getTitle()));
		mainPanel.add(new JLabel("https://github.com/libertyernie/Furry-Crossposter"));
		mainPanel.add(new JLabel(" "));
		mainPanel.add(new JLabel("Based on Furry Crossposter by Double Helix Industries"));
		mainPanel.add(new JLabel(" "));
		mainPanel.add(new JLabel("Loading..."));
		
		setUndecorated(true);
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
