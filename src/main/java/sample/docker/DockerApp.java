package sample.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApp {

	public static void main(String[] args) {
		SpringApplication.run(DockerApp.class, args);
		System.out.println("Docker Service Started...");
	}
}