package io.suren.datarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatarestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatarestApplication.class, args);
		System.out.println("Hello DATA Rest");
	}

}
