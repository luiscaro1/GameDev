package Levels;

import java.awt.Graphics;

import Entities.GameObjectManager;
import Launch.Handler;

public abstract class Level {

	private static Level currentLevel = null;
	private LevelManager levelManager;
	private GameObjectManager gom;
	private Handler handler;

	public Level(LevelManager levelManager, GameObjectManager gom, Handler handler) {
		this.levelManager = levelManager;

		this.handler = handler;

		this.gom = gom;

	}

	public static void setLevel(Level level) {
		currentLevel = level;
	}

	public static Level getLevel() {
		return currentLevel;
	}

	public abstract void tick();

	public abstract void render(Graphics g);

}
