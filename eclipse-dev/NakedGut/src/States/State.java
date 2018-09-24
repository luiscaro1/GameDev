package States;

import java.awt.Graphics;

import Launch.Handler;

public abstract class State {

	private static State currentState = null;
	private Handler handler;

	public State(Handler handler) {
		this.handler = handler;

	}

	public static void setState(State state) {
		currentState = state;

	}

	public static State getState() {
		return currentState;

	}

	public abstract void tick();

	public abstract void render(Graphics g);

}
