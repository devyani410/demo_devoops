package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {
    @GetMapping("/hello")
	public String get1(){
		return "hello user !!!";
	}

	@GetMapping("/hello1")
	public String get2(){
		return "hello user 1 !!!";
	}
	@GetMapping("/bye")
	public String get3(){
		return  "bye user" ;
	}
	@GetMapping("/greeting")
	public String get4(){
		return "Good Morning User";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
