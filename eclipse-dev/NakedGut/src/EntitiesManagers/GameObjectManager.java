package EntitiesManagers;

import java.awt.Graphics;
import java.util.LinkedList;

public class GameObjectManager {

	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	private GameObject tempObject;

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
	
	//adds objects to the game

	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	//removes objects from the game

	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
}
