package br.sc.gabrielrudger.prowaydesafio;

import org.springframework.stereotype.Controller;

@Controller
public class GameController {
	
	private final GameRepository gameRepository;

	GameController(final GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}
	
	private static void updateEntityFromDTO(final GameDTO gameDTO, final GameEntity gameEntity) {
		gameEntity.setScoreboard(gameDTO.getScoreboard());
		gameEntity.setSeasonMin(gameDTO.getSeason_min());
		gameEntity.setSeasonMax(gameDTO.getSeason_max());
		gameEntity.setBreakrecordMin(gameDTO.getBreakrecord_min());
		gameEntity.setBreakrecordMax(gameDTO.getBreakrecord_max());
	}

	private static GameEntity toEntity(final GameDTO gameDTO) {
		final int scoreboard = gameDTO.getScoreboard();
		final int season_min = gameDTO.getSeason_min();
		final int season_max = gameDTO.getSeason_max();
		final byte breakrecord_min = gameDTO.getBreakrecord_min();
		final byte breakrecord_max = gameDTO.getBreakrecord_max();
		return new GameEntity(scoreboard, season_min, season_max, breakrecord_min, breakrecord_max);
	}

	private static GameDTO toDTO(final GameEntity gameEntity) {
		final int scoreboard = gameEntity.getScoreboard();
		final int season_min = gameEntity.getSeasonMin();
		final int season_max = gameEntity.getSeasonMax();
		final byte breakrecord_min = gameEntity.getBreakrecordMin();
		final byte breakrecord_max = gameEntity.getBreakrecordMax();
		return new GameDTO(scoreboard, season_min, season_max, breakrecord_min, breakrecord_max);
	}
}
