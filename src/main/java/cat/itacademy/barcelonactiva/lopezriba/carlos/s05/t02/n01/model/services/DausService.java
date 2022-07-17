package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Daus;

public interface DausService {

	public Daus saveDaus(Daus daus);

	public void deleteAllDausByPlayerID(long id);

	public List<Daus> findAllDausByPlayerID(long id);

}
