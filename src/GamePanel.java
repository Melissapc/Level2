import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;



public class GamePanel extends JPanel implements ActionListener {
	Timer time;
	int x;
	int y;
	
	boolean up = false;
	boolean down = false;
	final int speed = 6;

	GamePanel() {
		time = new Timer(1000 / 60, this);
	}

	public void paintComponent(Graphics g) {
		g.fillRect(240, 220, 80, 80);
	}

	public void update() {
		time.start();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
	}
}
