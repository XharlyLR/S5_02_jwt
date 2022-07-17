package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Daus;

@Repository
public interface DausRepository extends JpaRepository<Daus, Long>{
	
	@Transactional
	List<Daus> deleteByPlayerID(long id);

	List<Daus> findAllByPlayerID(long id);
}
