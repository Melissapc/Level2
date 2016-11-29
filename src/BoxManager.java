import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box bigbox;
	ArrayList<Box> folder;

	BoxManager() {
		bigbox = new Box(60, 60, (int) (Math.random() * 600), (int) (Math.random() * 600), 10, 2, Color.magenta);
	}

	void draw(Graphics g) {
bigbox.draw(g);
	}

	void update() {
bigbox.update();
	}
}