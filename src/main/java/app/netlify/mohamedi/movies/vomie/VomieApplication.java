package app.netlify.mohamedi.movies.vomie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VomieApplication {

	public static void main(String[] args) {
		SpringApplication.run(VomieApplication.class, args);
	}

}
