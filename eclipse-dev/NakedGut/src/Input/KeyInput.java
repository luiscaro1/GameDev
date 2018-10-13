package Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Entities.GameObject;
import Entities.ObjectId;
import Launch.Handler;

public class KeyInput implements KeyListener {

	private Handler handler;
	private boolean[] keys, justPressed, cantPress;

	public KeyInput(Handler handler) {
		this.handler = handler;
		keys = new boolean[256];
		justPressed = new boolean[keys.length];
		cantPress = new boolean[keys.length];

	}

	public void tick() {
		for (int i = 0; i < keys.length; i++) {
			if (cantPress[i] && !keys[i]) {
				cantPress[i] = false;

			} else if (justPressed[i]) {
				cantPress[i] = true;
				justPressed[i] = false;
			}
			if (!cantPress[i] && keys[i]) {
				justPressed[i] = true;

			}
		}
	}

	public boolean keyJustPressed(int keyCode) {
		if (keyCode < 0 || keyCode >= keys.length)
			return false;

		return justPressed[keyCode];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		for (GameObject i : handler.getGom().object) {

			if (i.getId() == ObjectId.player) {

				if (key == KeyEvent.VK_D) {
					i.setRight(true);

				}
				if (key == KeyEvent.VK_A) {
					i.setLeft(true);

				}
				if (key == KeyEvent.VK_W && !i.isJumping()) {
					i.setVelY(-10);
					i.setJumping(true);

				}

			}

		}

		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for (GameObject i : handler.getGom().object) {

			if (i.getId() == ObjectId.player) {

				if (key == KeyEvent.VK_A) {
					i.setLeft(false);

				}

				if (key == KeyEvent.VK_D) {
					i.setRight(false);

				}

			}

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
