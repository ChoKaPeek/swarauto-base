package com.swarauto.game;

public class GameStatus {
    public static GameStatus create(final GameState state, final String screenfile) {
        return new GameStatus(state, screenfile);
    }

    private final GameState gameState;
    private final String screenFile;

    private GameStatus(final GameState state, final String screenfile) {
        this.gameState = state;
        this.screenFile = screenfile;
    }

    public GameState getGameState() {
        return gameState;
    }

    public String getScreenFile() {
        return screenFile;
    }
}
