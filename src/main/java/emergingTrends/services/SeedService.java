package emergingTrends.services;

import emergingTrends.entities.School;
import emergingTrends.entities.Student;
import org.springframework.stereotype.Service;


/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class SeedService extends BaseService {


    public int updateSeedData()
    {
        School sait = new School("sait");
        schoolRepository.saveAndFlush(sait);
        sait = schoolRepository.findByName("sait");

        Student bob = new Student("bob",sait,2.0);
        Student amy = new Student("amy",sait,3.0);
        Student fred= new Student("fred",sait,4.0);

        studentRepository.saveAndFlush(bob);
        studentRepository.saveAndFlush(amy);
        studentRepository.saveAndFlush(fred);
        return 0;
    }
}
