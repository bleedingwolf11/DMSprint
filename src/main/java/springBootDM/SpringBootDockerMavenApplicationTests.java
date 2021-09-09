package springBootDM;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDockerMavenApplicationTests {

	@RequestMapping("/")
	public String Home() {
	return "Home";
	}

}
