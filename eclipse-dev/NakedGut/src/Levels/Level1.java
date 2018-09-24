package Levels;

import java.awt.Graphics;

import Entities.Player;
import EntitiesManagers.GameObjectManager;
import EntitiesManagers.ObjectId;
import Launch.Game;
import Resources.Texture;

public class Level1 extends Level {
	private Texture tex = Game.getTex();
	private GameObjectManager GOManager;

	public Level1(LevelManager levelManager) {
		super(levelManager);

		GOManager = new GameObjectManager();
		GOManager.addObject(new Player(400, 400, ObjectId.player));

		// TODO Auto-generated constructor stub
	}

	public void tick() {
		GOManager.tick();

	}

	public void render(Graphics g) {
		GOManager.render(g);

	}

}
