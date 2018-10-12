package States;

import java.awt.Graphics;

import Entities.GameObjectManager;
import Launch.Handler;
import Levels.Level;
import Levels.Level1;
import Levels.LevelManager;

public class GameState extends State {
	// creates a level
	private Level level1;
	// accesses the levels
	private LevelManager levelManager;
	// handler for Game Objects
	private GameObjectManager gom;
	// accesses the states
	private Handler handler;

	public GameState(Handler handler) {
		super(handler);
		// this going give e access to changing states
		this.handler = handler;

		// creates a gameObject handler
		gom = new GameObjectManager();
		// makes the gom accesible to other classes

		handler.setGom(gom);
		// calls the method the creates the levels
		this.createLevels();

	}

	public void createLevels() {
		// switches the levels
		levelManager = new LevelManager(this);

		// sets the level into a level1 object
		level1 = new Level1(levelManager, gom, handler);

		// sets the level1 object as the current level(to begin)
		Level.setLevel(level1);

	}

	public void tick() {
		// updates all the gameObject values
		gom.tick();
		// updates the current level
		Level.getLevel().tick();

	}

	public void render(Graphics g) {
		// updates the visuals of each gameObject
		gom.render(g);
		// draws the current level
		Level.getLevel().render(g);

	}

}
