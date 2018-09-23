package UI;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public abstract class UIObject {

	protected int width, height;
	protected float x, y;
	protected Rectangle bounds;
	protected boolean hovering;
	protected boolean active = false;

	public UIObject(float x, float y, int width, int height) {
		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;
		this.bounds = new Rectangle((int) x, (int) y, width, height);
	}

	public abstract void tick();

	public abstract void render(Graphics g);

	public abstract void onClick();

	public void onMousePressed(MouseEvent e) {

		active = true;

	}

	public void onMouseMove(MouseEvent e) {

		if (this.bounds.contains(e.getX(), e.getY()))
			hovering = true;

		else
			hovering = false;

	}

	public void onMouseRelease(MouseEvent e) {

		if (hovering && e.getButton() == MouseEvent.BUTTON1) {
			this.onClick();
		}
		active = false;

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

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}

	public boolean isHovering() {
		return hovering;
	}

	public void setHovering(boolean hovering) {
		this.hovering = hovering;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
