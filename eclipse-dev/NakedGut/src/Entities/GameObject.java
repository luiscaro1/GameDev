package Entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import Launch.Handler;
import Levels.LevelManager;

public abstract class GameObject {
	protected int x, y;
	protected int velX;
	protected int velY;
	protected ObjectId id;
	protected LevelManager levelManager;
	protected Handler handler;

	public GameObject(int x, int y, ObjectId id, LevelManager levelManager, Handler handler) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.levelManager = levelManager;
		this.handler = handler;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public LevelManager getLevelManager() {
		return levelManager;
	}

	public void setLevelManager(LevelManager levelManager) {
		this.levelManager = levelManager;
	}

	public abstract void tick(LinkedList<GameObject> object);

	public abstract void render(Graphics g);

	public abstract Rectangle getBounds();

	public abstract Rectangle getBoundsRight();

	public abstract Rectangle getBoundsLeft();

	public abstract Rectangle getBoundsTop();

}
