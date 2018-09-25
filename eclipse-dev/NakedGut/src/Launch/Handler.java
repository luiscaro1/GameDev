package Launch;

import java.awt.Graphics;
import java.util.LinkedList;

import Entities.GameObject;
import Input.MouseManager;

public class Handler {
	private Game game;
	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	private GameObject tempObject;

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

	public void tick() {

		// goes through the the game objects and updates their tick methods
		for (int i = 0; i < object.size(); i++) {
			tempObject = object.get(i);
			tempObject.tick(object);

		}

	}

	// goes through the the game objects and draws their render methods
	public void render(Graphics g) {

		for (int i = 0; i < object.size(); i++) {
			tempObject = object.get(i);
			tempObject.render(g);

		}

	}

	// adds objects to the game

	public void addObject(GameObject object) {
		this.object.add(object);
	}

	// removes objects from the game

	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
}