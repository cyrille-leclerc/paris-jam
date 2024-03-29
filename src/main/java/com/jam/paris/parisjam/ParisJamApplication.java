package com.jam.paris.parisjam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ParisJamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParisJamApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Hello Paris JAM 1";
	}
}
