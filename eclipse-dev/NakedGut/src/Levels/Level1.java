package Levels;

import java.awt.Graphics;

import Entities.GameObjectManager;
import Entities.ObjectId;
import Entities.Player;
import Launch.Game;
import Launch.Handler;
import Resources.Texture;

public class Level1 extends Level {
	private Texture tex = Game.getTex();
	// handler for GameObject
	private GameObjectManager gom;
	// gives me access to the Game State
	private LevelManager levelManager;
	// gives state access the level
	private Handler handler;

	public Level1(LevelManager levelManager, GameObjectManager gom, Handler handler) {
		super(levelManager, gom, handler);
		this.gom = gom;
		this.handler = handler;

		gom.addObject(new Player(300, 300, ObjectId.player, levelManager, handler));

		// TODO Auto-generated constructor stub
	}

	public void tick() {

	}

	public void render(Graphics g) {

	}

}
