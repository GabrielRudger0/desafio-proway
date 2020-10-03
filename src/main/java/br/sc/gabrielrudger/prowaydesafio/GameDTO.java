package br.sc.gabrielrudger.prowaydesafio;

public class GameDTO {
	
	private final Long gameId;

	private final int scoreboard;

	public GameDTO(final Long gameId,final int scoreboard) {
		this.gameId = gameId;
		this.scoreboard = scoreboard;

	}
	
	public Long getGameId() { 
		return gameId;
	}

	public int getScoreboard() {
		return scoreboard;
	}

}
