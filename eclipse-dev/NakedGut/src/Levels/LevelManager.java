package Levels;

import States.GameState;

public class LevelManager {

	private GameState gameState;

	public LevelManager(GameState gameState) {
		this.gameState = gameState;

	}

	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}

}
