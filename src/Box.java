import java.awt.Color;
import java.awt.Graphics;

public class Box {
	boolean empty;
	boolean Alive;
	Color color;

	int width;
	int height;
	int x;
	int y;
	int speedx;
	int speedy;

	Box(int width, int height, int x, int y, int speedx, int speedy, Color color) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.speedx = speedx;
		this.speedy = speedy;
		this.color = color;
		this.Alive = true;
		this.empty = true;

	}

	boolean isAlive() {
		return Alive;

	}

	void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);

	}

	void boundaryCheck() {

		if (x > 600) {
			speedx = -speedx;
		}
		if (x < 0) {
			speedx = -speedx;
		}
		if (y > 600) {
			speedy = -speedy;
		}
		if (y < 0) {
			speedy = -speedy;
		}
	}

	void update() {
		x = x + speedx;
		y = y + speedy;
		boundaryCheck();
	}
}