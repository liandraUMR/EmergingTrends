package emergingTrends;

import emergingTrends.services.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "emergingTrends.repositories")
public class EmergingTrendsApplication {

    @Autowired
    SeedService seedService;

    public static void main(String[] args) {
        SpringApplication.run(EmergingTrendsApplication.class, args);
    }
}
