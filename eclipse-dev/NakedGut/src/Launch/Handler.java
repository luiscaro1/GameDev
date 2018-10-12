package Launch;

import java.awt.Graphics;

import Entities.GameObjectManager;
import Input.MouseManager;

public class Handler {
	private Game game;
	private GameObjectManager gom;

// constructor for the class and takes an instance of the game which will come very handy
	public Handler(Game game) {

		this.game = game;

	}

	// returns the current game

	public Game getGame() {
		return game;
	}

//sets the current game
	public void setGame(Game game) {
		this.game = game;
	}

	public MouseManager getMouseManager() {
		return game.getMouseManager();

	}

	public GameObjectManager getGom() {
		return gom;
	}

	public void setGom(GameObjectManager gom) {
		this.gom = gom;
	}

	public void tick() {

	}

	public void render(Graphics g) {

	}

}