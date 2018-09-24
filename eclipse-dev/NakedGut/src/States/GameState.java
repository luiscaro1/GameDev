package States;

import java.awt.Graphics;

import Launch.Handler;
import Levels.Level;
import Levels.Level1;
import Levels.LevelManager;

public class GameState extends State {
	// creates a level
	private Level level1;
	private LevelManager levelManager;

	public GameState(Handler handler) {
		super(handler);

		this.loadLevels();

	}

	public void loadLevels() {
		// switches the levels
		levelManager = new LevelManager(this);

		// sets the level into a level1 object
		level1 = new Level1(levelManager);

		// sets the level1 object as the current level(to begin)
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
