package Resources;

import java.awt.image.BufferedImage;

public class Texture {
	SpriteSheet ss;

	private BufferedImage Start_Sheet = null;

	public BufferedImage[] player = new BufferedImage[3];

	public Texture() {

		BufferedImageLoader loader = new BufferedImageLoader();
		try {

			Start_Sheet = loader.loadImage("/start.png");

		} catch (Exception e) {
			e.printStackTrace();
		}

		ss = new SpriteSheet(Start_Sheet);

		getTextures();

	}

	private void getTextures() {

		player[0] = ss.grabImage(1, 1, 64, 32);

	}

}
