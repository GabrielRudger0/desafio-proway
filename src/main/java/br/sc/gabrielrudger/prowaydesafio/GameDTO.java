package br.sc.gabrielrudger.prowaydesafio;

public class GameDTO {

	private final int scoreboard;
	private final int season_min;
	private final int season_max;
	private final byte breakrecord_min;
	private final byte breakrecord_max;

	public GameDTO(final int scoreboard, final int season_min, final int season_max, final byte breakrecord_min,
			final byte breakrecord_max) {

		this.scoreboard = scoreboard;
		this.season_min = season_min;
		this.season_max = season_max;
		this.breakrecord_min = breakrecord_min;
		this.breakrecord_max = breakrecord_max;

	}

	public int getScoreboard() {
		return scoreboard;
	}

	public int getSeason_min() {
		return season_min;
	}

	public int getSeason_max() {
		return season_max;
	}

	public byte getBreakrecord_min() {
		return breakrecord_min;
	}

	public byte getBreakrecord_max() {
		return breakrecord_max;
	}

}
