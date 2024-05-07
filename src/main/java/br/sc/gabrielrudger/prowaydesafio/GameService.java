package br.sc.gabrielrudger.prowaydesafio;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/system")

public class GameService {

	private final GameController gameController;

	public GameService(GameController gameController) {
		this.gameController = gameController;
	}

	@GetMapping("/gamelist")
	public List<GameDTO> list() {
		return this.gameController.getAllGames();
	}

	@PostMapping("/gameadd")
	public Long addGame(@RequestBody GameDTO gameDTO) {
		System.out.println("test");
		System.out.println("test2");
		return this.gameController.insertGame(gameDTO);
	}
	
	@GetMapping("/gameseasonpoints/")
	public List<SeasonPoints> seasonPoints() {
		return this.gameController.seasonPoints();
	}
	
	@GetMapping("/gamerecordbreakcount")
	public int recordBreak() {
		return this.gameController.record();
	}

}
