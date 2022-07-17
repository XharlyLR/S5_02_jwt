package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Role;
import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.User;
import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.services.UserService;

@SpringBootApplication
public class S05T02N01LopezRibaCarlosApplication {

	public static void main(String[] args) {
		SpringApplication.run(S05T02N01LopezRibaCarlosApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role("ROLE_USER"));
			userService.saveRole(new Role("ROLE_ADMIN"));
			
			userService.saveUser(new User("User 1", "user1", "1234", new ArrayList<>()));
			userService.saveUser(new User("User 2", "user2", "1234", new ArrayList<>()));
			
			userService.addRoleToUser("user1", "ROLE_USER");
			userService.addRoleToUser("user2", "ROLE_ADMIN");
			userService.addRoleToUser("user2", "ROLE_USER");
		};
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
