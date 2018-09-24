package States;

import java.awt.Graphics;

import Launch.Game;
import Launch.Handler;
import Resources.Texture;
import UI.ClickListener;
import UI.UIImageButton;
import UI.UIManager;

public class MenuState extends State {

	private Handler handler;
	private UIManager uiManager;
	private Texture tex = Game.getTex();

	public MenuState(Handler handler) {
		super(handler);
		this.handler = handler;
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUimanager(uiManager);

		uiManager.addObjects(new UIImageButton(50, 50, 64, 32, tex.player, new ClickListener() {
			@Override
			public void onClick() {
				handler.getMouseManager().setUimanager(null);

				State.setState(handler.getGame().gameState);
			}
		}));

	}

	public void tick() {

		handler.getMouseManager().setUimanager(uiManager);

		uiManager.tick();

	}

	public void render(Graphics g) {

		uiManager.Render(g);

	}

}
