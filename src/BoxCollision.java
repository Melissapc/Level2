import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxCollision {
	JFrame frame;
	final static int width = 600;
	final static int height = 600;
	GamePanel panel;

	int x;
	int y;
	int rectwidth;
	int rectheight;
	Rectangle rectangle = new Rectangle();

	public static void main(String[] args) {
		BoxCollision box = new BoxCollision();
		box.setup();
	}

	BoxCollision() {
		frame = new JFrame();
		panel = new GamePanel();
		panel.start();
	}

	void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
