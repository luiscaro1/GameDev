package States;

import java.awt.Graphics;

import Levels.Level;
import Levels.Level1;

public class GameState extends State {
	// creates a level
	private Level level1;

	public GameState() {
//sets the level level into a level1 object
		level1 = new Level1();
//sets the level1 object as the current level(to begin)
		Level.setLevel(level1);

	}

	public void tick() {

		// updates the current level
		Level.getLevel().tick();

	}

	public void render(Graphics g) {
		// draws the current level
		Level.getLevel().render(g);

	}

}
