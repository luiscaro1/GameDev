package Resources;

import java.awt.image.BufferedImage;

public class Texture {

	public BufferedImage startButton = null;

	public Texture() {
		BufferedImageLoader loader = new BufferedImageLoader();

		startButton = loader.loadImage("/start.png");

	}

	public void getTextures() {

	}

}
