package com.example.KubeSpringDock;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class KubeSpringDockApplication {
	
	@GetMapping("/message")
	public String displayMessage(){
		return "Congratulation you successfully deployed your application to Openshift !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(KubeSpringDockApplication.class, args);
	}

}
