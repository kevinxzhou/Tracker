import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.apple.eawt.Application;
import com.sun.awt.AWTUtilities;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("restriction")
public class SplashScreen extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	public SplashScreen() {
		// Setup window properties
		Color transparent = new Color(0,0,0,0);
		int winx = 600;
		int winy = 600;
		setSize(winx, winy);
		setUndecorated(true);
		setBackground(transparent);
		setIconImage(new ImageIcon("images/icon.png").getImage());
		Application.getApplication().setDockIconImage(
				new ImageIcon("images/icon.png").getImage());
		setLocationRelativeTo(null);
		JPanel p1 = new JPanel();
		p1.setBackground(transparent);
		JLabel background=new JLabel(new ImageIcon("images/splash.png"));
		p1.add(background);
		add(p1);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

