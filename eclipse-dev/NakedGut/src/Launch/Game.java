package Launch;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import Input.MouseManager;
import Resources.Texture;
import States.GameState;
import States.LoseState;
import States.MenuState;
import States.OptionState;
import States.PauseState;
import States.State;

public class Game extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Thread thread;
	private boolean isRunning = false;
	public static int WIDTH, HEIGHT;
	public State menuState;
	public State gameState;
	public State loseState;
	public State pauseState;
	public State optionState;
	public static Texture tex;
	private Handler handler;
	private MouseManager mouseManager;

	public Game() {
		// makes a new window
		new Window(800, 600, "Naked Gut", this);

		// assigns the width and height of the window to a static variable for access in
		// other classes
		WIDTH = this.getWidth();
		HEIGHT = this.getHeight();

		// loads Images in the game before any state is set as the current state
		tex = new Texture();
		// start the game thread
		this.start();
		handler = new Handler(this);
		// adds Mouse Input to the game
		mouseManager = new MouseManager();
		// mouse clicks
		this.addMouseListener(mouseManager);
		// cursor movement
		this.addMouseMotionListener(mouseManager);

		// makes the menu state the beginning state of the loop
		// initializes the different states
		// creates new instances of each state
		menuState = new MenuState(handler);
		gameState = new GameState(handler);
		loseState = new LoseState(handler);
		pauseState = new PauseState(handler);
		optionState = new OptionState(handler);

		State.setState(menuState);

	}

	public synchronized void start() {

//makes sure there isn't a thread already running
		if (this.isRunning)
			return;
//makes a new thread 
		this.isRunning = true;
		thread = new Thread(this);
		this.thread.start();

	}

	public synchronized void stop() {
		// if the thread has already stopped there is no reason to stop it again
		if (!isRunning)
			return;
		// stops the thread

		this.isRunning = false;
		try {
			this.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

// the main loop of the game , which optimizes for 60 fps
	public void run() {

		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while (this.isRunning) {
			// makes sure the games runs smoothly at 60 FPS
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if (delta >= 1) {
				// re-renders and ticks the game around 60 times per second
				tick();
				render();
				ticks++;
				delta--;
			}

			if (timer >= 1000000000) {
				System.out.println(ticks);
				ticks = 0;
				timer = 0;
			}
		}

		stop();

	}

	public void render() {
		// creates a buffer strategy that draws three frames ahead for smooth
		// transitions
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		// draw here
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		// renders the current state at 60 frames second

		State.getState().render(g);
		// end here

		// makes sure the render stops properly
		g.dispose();
		// makes the images appear
		bs.show();

	}

	// updates all the values in the game from every state

	public void tick() {

		State.getState().tick();

	}

	// makes tex accessible to other classes
	public static Texture getTex() {
		return tex;
	}

	// starts a new game

	public MouseManager getMouseManager() {
		return mouseManager;
	}

	public void setMouseManager(MouseManager mouseManager) {
		this.mouseManager = mouseManager;
	}

	public static void main(String[] args) {
		new Game();

	}

}
