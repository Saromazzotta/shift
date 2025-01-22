package com.saromazzotta.shift;

import com.saromazzotta.shift.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ShiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiftApplication.class, args);
	}

	@GetMapping
	public List<User> hello() {
		return List.of(
				new User(
						1L,
						"test@test.com",
						"password"
				)
		);
	}



}
