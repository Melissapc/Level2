import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer time;
	int x;
	int y;
	Box box;
	boolean up = false;
	boolean down = false;
	final int speed = 6;
	BoxManager queen;

	GamePanel() {
		time = new Timer(1000 / 60, this);
		queen = new BoxManager();
	}

	public void paintComponent(Graphics g) {
		queen.draw(g);
	}

	public void start() {
		time.start();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		queen.update();
		repaint();

	}
}
