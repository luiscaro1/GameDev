package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
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

	public Player(int x, int y, ObjectId id, LevelManager levelManager, Handler handler) {
		super(x, y, id, levelManager, handler);

		this.handler = handler;

		this.levelManager = levelManager;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick(LinkedList<GameObject> object) {
		// TODO Auto-generated method stub
		x += velX;

		velX = 1;

		if (this.getX() >= Game.WIDTH)
			State.setState(handler.getGame().menuState);

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, 32, 32);
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
