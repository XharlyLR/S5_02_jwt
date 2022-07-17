package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByName(String name);
}
