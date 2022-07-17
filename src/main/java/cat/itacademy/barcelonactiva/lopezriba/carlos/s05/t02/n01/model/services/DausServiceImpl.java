package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Daus;
import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.repository.DausRepository;

@Service
public class DausServiceImpl implements DausService{

	@Autowired
	DausRepository dausRepository;

	@Override
	public Daus saveDaus(Daus daus) {
		return dausRepository.save(daus);
	}

	@Override
	public void deleteAllDausByPlayerID(long id) {
		dausRepository.deleteByPlayerID(id);
	}

	@Override
	public List<Daus> findAllDausByPlayerID(long id) {
		return dausRepository.findAllByPlayerID(id);
	}
}
