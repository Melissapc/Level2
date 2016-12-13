import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box bigbox;
	ArrayList<Box> boxes;
	int enemyTimer = 0;
	int spawnEnemyTimer = 20;

	BoxManager() {
		bigbox = new Box(100,100, (int) (Math.random() * 600), (int) (Math.random() * 600), 7,2, Color.pink);
		boxes = new ArrayList<Box>();
	}

	void addEnemy(Box box) {
		boxes.add(box);
	}

	void cleanupBoxes() {

	}

	void update() {
		bigbox.update();
		for (int i = 0; i < boxes.size(); i++) {
			Box min = boxes.get(i);
			min.update();

		}
		manageEnemies();
		checkEnemyBoxes();
		cleanupEnemyBoxes();
	}

	void draw(Graphics g) {
		bigbox.draw(g);
		for (int i = 0; i < boxes.size(); i++) {
			Box v = boxes.get(i);
			v.draw(g);

		}

	}

	void manageEnemies() {

		enemyTimer++;
		if (enemyTimer > spawnEnemyTimer) {
			Box boxv = new Box(30, 30, (int) (Math.random() * 600), (int) (Math.random() * 600), 6, 6, Color.yellow);
			addEnemy(boxv);
			enemyTimer = 0;
		}

	}

	void checkBoxEat(Box A, Box B) {

		if ((A.x < B.x) && (A.x + A.width > B.x + B.width) && (A.y < B.y) && (A.y + A.height > B.y + B.height)) {
			if (B.Alive == true) {
				System.out.println("hii");
				B.Alive = false;
			}
		}

	}
	void checkEnemyBoxes() {
		for (int i = 0; i < boxes.size(); i++) {
			checkBoxEat(bigbox, boxes.get(i));
		}
	}

	void cleanupEnemyBoxes() {
		for (int i = 0; i < boxes.size(); i++) {
			Box b = boxes.get(i);
			if (b.isAlive() == false) {
				boxes.remove(i);
			}

		}
	}
}