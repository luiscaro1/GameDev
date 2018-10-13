package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import Launch.Game;
import Launch.Handler;
import Levels.LevelManager;
import States.State;

public class Player extends GameObject {
	// gives the player access to change levels
	private LevelManager levelManager;
	// gives the player access to change States
	private Handler handler;

	public Player(float x, float y, ObjectId id, LevelManager levelManager, Handler handler) {
		super(x, y, id, levelManager, handler);

		this.handler = handler;

		this.levelManager = levelManager;
		width = 32;
		height = 32;

		falling = true;
		velX = 5;

	}

	@Override
	public void tick(LinkedList<GameObject> object) {

		if (y >= Game.HEIGHT - width) {

			falling = false;
		} else {
			falling = true;

		}

		Move();

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect((int) x, (int) y, width, height);
		// TODO Auto-generated method stub

	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getBoundsRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getBoundsLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getBoundsTop() {
		// TODO Auto-generated method stub
		return null;
	}

}
