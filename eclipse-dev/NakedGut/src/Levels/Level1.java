package Levels;

import java.awt.Graphics;

import Launch.Game;
import Resources.Texture;

public class Level1 extends Level {

	private Texture tex = Game.getTex();

	public void tick() {

	}

	public void render(Graphics g) {

		g.drawImage(tex.startButton, 0, 0, null);

	}

}
