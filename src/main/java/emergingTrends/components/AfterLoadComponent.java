package emergingTrends.components;

import emergingTrends.services.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by 631152 on 1/14/2016.
 */
@Component
public class AfterLoadComponent implements CommandLineRunner
{
    @Autowired
    SeedService seedService;

    @Override
    public void run(String... args) throws Exception
    {
        seedService.updateSeedData();

    }
}
