package States;

import java.awt.Color;
import java.awt.Graphics;

import Launch.Game;

public class MenuState extends State {

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);

	}

}
