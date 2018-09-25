package Levels;

import States.GameState;

public class LevelManager {
	
	//changes the levels in the game state

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
