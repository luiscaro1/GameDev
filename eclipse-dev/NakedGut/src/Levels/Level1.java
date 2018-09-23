package Levels;

import java.awt.Color;
import java.awt.Graphics;

public class Level1 extends Level {

	public void tick() {

	}

	public void render(Graphics g) {

		g.setColor(Color.blue);
		g.fillRect(0, 0, 45, 45);

	}

}
