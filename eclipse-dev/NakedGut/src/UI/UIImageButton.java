package UI;

import java.awt.*;
import java.awt.image.BufferedImage;

import States.State;

public class UIImageButton extends UIObject {
	private BufferedImage[] images;
	private ClickListener clicker;
	private State state;

	public UIImageButton(float x, float y, int width, int height, BufferedImage[] images, ClickListener clicker) {
		super(x, y, width, height);
		this.images = images;
		this.clicker = clicker;
		// this.state = state;
	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {

		// makes it so the a button always appears even if the click isnt on a botton
		g.drawImage(images[0], (int) x, (int) y, width, height, null);
		// fix: makes it so only the button that is clicked turns dark when pressed
		if (active && hovering) {
			if (images.length == 3) {
				g.drawImage(images[2], (int) x, (int) y, width, height, null);
			}
		} else if (hovering) {
			g.drawImage(images[1], (int) x, (int) y, width, height, null);
		} else {
			g.drawImage(images[0], (int) x, (int) y, width, height, null);

		}
	}

	@Override
	public void onClick() {
		clicker.onClick();
	}

}
