package Entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public abstract class GameObject {
	private float x, y, velX, velY;
	private ObjectId id;

	public GameObject(float x, float y, ObjectId id) {
		this.x = x;
		this.y = y;
		this.id = id;

	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getVelX() {
		return velX;
	}

	public void setVelX(float velX) {
		this.velX = velX;
	}

	public float getVelY() {
		return velY;
	}

	public void setVelY(float velY) {
		this.velY = velY;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public abstract void tick(LinkedList<GameObject> object);

	public abstract void render(Graphics g);

	public abstract Rectangle getBounds();

	public abstract Rectangle getBoundsRight();

	public abstract Rectangle getBoundsLeft();

	public abstract Rectangle getBoundsTop();

}