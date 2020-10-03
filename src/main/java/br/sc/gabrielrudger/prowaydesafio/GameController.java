package br.sc.gabrielrudger.prowaydesafio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class GameController {

	private final GameRepository gameRepository;

	GameController(final GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	private static void updateEntityFromDTO(final GameDTO gameDTO, final GameEntity gameEntity) {
		gameEntity.setScoreboard(gameDTO.getScoreboard());
	}

	private static GameEntity toEntity(final GameDTO gameDTO) {
		final int scoreboard = gameDTO.getScoreboard();
		return new GameEntity(scoreboard);
	}

	private static GameDTO toDTO(final GameEntity gameEntity) {
		final Long id = gameEntity.getGameId();
		final int scoreboard = gameEntity.getScoreboard();
		return new GameDTO(id, scoreboard);
	}

	List<GameDTO> getAllGames() {
		List<GameDTO> games = new ArrayList<GameDTO>();

		final Iterable<GameEntity> entities = gameRepository.findAll();
		for (final GameEntity gameEntity : entities) {
			GameDTO gameDTO = GameController.toDTO(gameEntity);
			games.add(gameDTO);
		}
		return games;
	}

	Long insertGame(final GameDTO gameDTO) {
		final GameEntity gameEntity = GameController.toEntity(gameDTO);
		this.gameRepository.save(gameEntity);
		return gameEntity.getGameId();
	}

	List<SeasonPoints> seasonPoints() {

		List<GameDTO> games = getAllGames();

		List<SeasonPoints> points = new ArrayList<>();

		SeasonPoints seasonPoints = new SeasonPoints();

		int maxPoints = 0;
		int minPoints = games.get(0).getScoreboard();

		for (int i = 0; i < games.size(); i++) {

			if (games.get(i).getScoreboard() > maxPoints) {
				maxPoints = games.get(i).getScoreboard();
			}

			if (games.get(i).getScoreboard() < minPoints) {
				minPoints = games.get(i).getScoreboard();
			}
		}

		seasonPoints.setMaxPoints(maxPoints);
		seasonPoints.setMinPoints(minPoints);

		points.add(seasonPoints);

		return points;
	}

	int record() {
		List<GameDTO> games = getAllGames();

		int breakrecord = 0;

		for (int i = 1; i < games.size(); i++) {
			if (games.get(i).getScoreboard() > games.get(i - 1).getScoreboard()) {
				breakrecord++;
			}
			
		}
		return breakrecord;
	}

}
