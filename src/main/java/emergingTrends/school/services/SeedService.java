package emergingTrends.school.services;

import emergingTrends.school.entities.Student;
import org.springframework.stereotype.Service;


/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class SeedService extends BaseService
{
    public void updateSeedData()
    {
        Student bob = new Student("bob");
        bob.setGpa(4);
        Student frank = new Student("frank");
        Student amy = new Student("amy");
        studentRepository.saveAndFlush(bob);
        studentRepository.saveAndFlush(frank);
        studentRepository.saveAndFlush(amy);
    }
}
