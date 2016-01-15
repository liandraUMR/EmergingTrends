package emergingTrends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "emergingTrends.repositories")
public class EmergingTrendsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmergingTrendsApplication.class, args);
	}
}
