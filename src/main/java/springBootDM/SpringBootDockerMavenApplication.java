package springBootDM;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="controller")
public class SpringBootDockerMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}
	
	
	
}

