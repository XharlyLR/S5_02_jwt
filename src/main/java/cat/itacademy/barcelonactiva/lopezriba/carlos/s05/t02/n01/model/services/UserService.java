package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Role;
import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User>getUsers();

}
