package springBootDM;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(scanBasePackages="controller")
public class SpringBootDockerMavenApplication {

	@RequestMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}
	
	
}

