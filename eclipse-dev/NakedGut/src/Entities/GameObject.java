package Entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import Launch.Handler;
import Levels.LevelManager;

public abstract class GameObject {
	protected float x, y;
	protected float velX = 0;
	protected float velY = 0;
	protected ObjectId id;
	protected LevelManager levelManager;
	protected Handler handler;
	protected boolean left, right, falling, jumping;
	protected float gravity = 0.3f;
	protected int width, height, jumpCount;
	protected float jumpTimer;
	protected final float MAX_SPEED = 10;

	public GameObject(float x, float y, ObjectId id, LevelManager levelManager, Handler handler) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.levelManager = levelManager;
		this.handler = handler;

	}

	public void Move() {
		y += velY;

		if (falling || jumping) {
			velY += gravity;
		}

		if (velY > MAX_SPEED) {
			velY = MAX_SPEED;
		}

		if (left) {
			x -= velX;

		}
		if (right) {
			x += velX;
		}

	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
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

	public boolean isJumping() {
		return jumping;
	}

	public void setJumping(boolean jumping) {
		this.jumping = jumping;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getJumpCount() {
		return jumpCount;
	}

	public void setJumpCount(int jumpCount) {
		this.jumpCount = jumpCount;
	}

	public LevelManager getLevelManager() {
		return levelManager;
	}

	public void setLevelManager(LevelManager levelManager) {
		this.levelManager = levelManager;
	}

	public boolean isFalling() {
		return falling;
	}

	public void setFalling(boolean falling) {
		this.falling = falling;
	}

	public float getJumpTimer() {
		return jumpTimer;
	}

	public void setJumpTimer(float jumpTimer) {
		this.jumpTimer = jumpTimer;
	}

	public abstract void tick(LinkedList<GameObject> object);

	public abstract void render(Graphics g);

	public abstract Rectangle getBounds();

	public abstract Rectangle getBoundsRight();

	public abstract Rectangle getBoundsLeft();

	public abstract Rectangle getBoundsTop();

}
