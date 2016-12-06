import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box bigbox;
	ArrayList<Box> boxes;
	int enemyTimer = 0;
	int spawnEnemyTimer = 20;

	BoxManager() {
		bigbox = new Box(60, 60, (int) (Math.random() * 600), (int) (Math.random() * 600), 10, 2, Color.pink);
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
			Box boxv = new Box(30, 30, (int) (Math.random() * 600), (int) (Math.random() * 600), 10, 8, Color.yellow);
			addEnemy(boxv);
			enemyTimer = 0;
		}

	}

	void checkBoxEat() {
		for (int i = 0; i < boxes.size(); i++) {
			Box v = boxes.get(i);
	}

}}