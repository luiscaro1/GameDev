package Resources;

import java.awt.image.BufferedImage;

public class Texture {
	private SpriteSheet startBut;
	private SpriteSheet playerSprite;

	private BufferedImage Start_Sheet = null;
	private BufferedImage Player_Sheet = null;

	public static BufferedImage[] start = new BufferedImage[3];
	public static BufferedImage[] player = new BufferedImage[20];

	public Texture() {

		BufferedImageLoader loader = new BufferedImageLoader();
		try {

			Start_Sheet = loader.loadImage("/start.png");
			Player_Sheet = loader.loadImage("/playerMovement.png");

		} catch (Exception e) {
			e.printStackTrace();
		}

		startBut = new SpriteSheet(Start_Sheet);
		playerSprite = new SpriteSheet(Player_Sheet);

		getTextures();

	}

	private void getTextures() {

		start[0] = startBut.grabImage(1, 1, 64, 32);
		////////////////////////////////////////////
		player[0] = playerSprite.grabImage(1, 1, 64, 64);
	}

}
