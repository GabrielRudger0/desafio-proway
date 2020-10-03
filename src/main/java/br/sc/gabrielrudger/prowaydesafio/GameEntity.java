package br.sc.gabrielrudger.prowaydesafio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Game")
public class GameEntity implements Serializable {

	private static final long serialVersionUID = 3530665454403594487L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientId;

	private int scoreboard;

	protected GameEntity() {

	}

	public GameEntity(final int scoreboard) {
		this.scoreboard = scoreboard;

	}

	@Override
	public String toString() {
		return "GameEntity [gameId=" + this.clientId + ", scoreboard=" + this.scoreboard + "]";
	}
	
	public Long getGameId() {
		return this.clientId;
}

	public int getScoreboard() {
		return scoreboard;
	}

	public void setScoreboard(int scoreboard) {
			this.scoreboard = scoreboard;
	}
	
}
