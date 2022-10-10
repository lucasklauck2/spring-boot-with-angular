package br.com.lucasklauck.springbootwithangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@SpringBootApplication
public class SpringBootWithAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithAngularApplication.class, args);
	}

 	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public String error() {
        return "forward:/index.html";
	}

}
