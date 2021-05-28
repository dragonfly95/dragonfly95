package com.example.dragonfly95;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@SpringBootApplication
public class Dragonfly95Application {

	public static void main(String[] args) {
		SpringApplication.run(Dragonfly95Application.class, args);
	}

}

@RestController
class HelloController {
	
	@GetMapping("greeting")
	public MyHello greeting() {
		return new MyHello("Hello!");
	}

}


@Controller
class Hello2Controller {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}

@Data
class MyHello {
	
	public MyHello() {}
	public MyHello(String m) {
		this.message = m;
	}
	String message;
}
