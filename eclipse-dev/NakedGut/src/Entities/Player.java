package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.LinkedList;

import Launch.Game;
import Launch.Handler;
import Levels.LevelManager;
import Resources.Texture;

public class Player extends GameObject {
	// gives the player access to change levels
	private LevelManager levelManager;
	// gives the player access to change States
	private Handler handler;
	private Texture tex = Game.getTex();

	public Player(float x, float y, ObjectId id, LevelManager levelManager, Handler handler) {
		super(x, y, id, levelManager, handler);

		this.handler = handler;

		this.levelManager = levelManager;
//		falling = true;
		width = 64;
		height = 64;

		velX = 5;

	}

	@Override
	public void tick(LinkedList<GameObject> object) {

		Move();

	}

	@Override
	public void render(Graphics g) {

		g.drawImage(tex.player[0], (int) x - 64, (int) y, 160, 160, null);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.ORANGE);

		g2d.draw(getBounds());

	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int) x, (int) y, 32, 64);

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
