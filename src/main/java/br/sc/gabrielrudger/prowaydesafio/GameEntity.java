package br.sc.gabrielrudger.prowaydesafio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.cache.support.NullValue;

@Entity(name = "Game")
public class GameEntity implements Serializable {

	private static final long serialVersionUID = 3530665454403594487L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clientId;

	private int scoreboard;

	private int season_min;

	private int season_max;

	private byte breakrecord_min;

	private byte breakrecord_max;

	protected GameEntity() {

	}

	public GameEntity(final int scoreboard, final int season_min, final int season_max, final byte breakrecord_min,
			final byte breakrecord_max) {
		this.scoreboard = scoreboard;
		this.season_min = season_min;
		this.season_max = season_max;
		this.breakrecord_min = breakrecord_min;
		this.breakrecord_max = breakrecord_max;
	}

	@Override
	public String toString() {
		return "GameEntity [gameId=" + this.clientId + "scoreboard=" + this.scoreboard + "season_min=" + this.season_min + 
				"season_max=" + this.season_max + "breakrecord_min=" + this.breakrecord_min + "breakrecord_max=" + breakrecord_max + "]";
	}
	
	public Long getGameId() {
		return this.clientId;
}

	public int getScoreboard() {
		return scoreboard;
	}

	public void setScoreboard(int scoreboard) {
		if (scoreboard < 0) {
			this.scoreboard = scoreboard;
		}
	}

	public int getSeasonMin() {
		return season_min;
	}

	public void setSeasonMin(final int season_min) {
		if (season_min < 0) {
			this.season_min = season_min;
		}
		
	}

	public int getSeasonMax() {
		return season_max;
	}

	public void setSeasonMax(final int season_max) {
		if (season_max < 0 ) {
			this.season_max = season_max;
		}
	}

	public byte getBreakrecordMin() {
		return breakrecord_min;
	}

	public void setBreakrecordMin(final byte breakrecord_min) {
		if (breakrecord_min < 0) {
			this.breakrecord_min = breakrecord_min;
		}
	}

	public byte getBreakrecordMax() {
		return breakrecord_max;
	}

	public void setBreakrecordMax(final byte breakrecord_max) {
		if (breakrecord_max < 0) {
			this.breakrecord_max = breakrecord_max;
		}
	}
	
}
