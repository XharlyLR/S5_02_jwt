package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Player;

public interface PlayerService {

	public Player savePlayer(Player player);

	public Optional<Player> findPlayerById(long id);

	public List<Player> findAllPlayer();
	
	public Optional<Player> findPlayerByNomPlayer(String nom);

}
