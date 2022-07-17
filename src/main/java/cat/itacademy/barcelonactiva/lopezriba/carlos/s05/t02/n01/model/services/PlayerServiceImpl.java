package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Player;
import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	PlayerRepository playerRepository;

	@Override
	public Player savePlayer(Player player) {
		if (player.getNomPlayer().equals("ANÒNIM"))
			return playerRepository.save(player);
		
		Optional<Player> playerData =  findPlayerByNomPlayer(player.getNomPlayer());
		if (!playerData.isPresent())
			return playerRepository.save(player);
		else
			return null;
	}
	
	@Override
	public Optional<Player> findPlayerByNomPlayer(String nom) {
		return playerRepository.findByNomPlayer(nom);
	}

	@Override
	public Optional<Player> findPlayerById(long id) {
		return playerRepository.findById(id);
	}

	@Override
	public List<Player> findAllPlayer() {
		return playerRepository.findAll();
	}
	
	
}
