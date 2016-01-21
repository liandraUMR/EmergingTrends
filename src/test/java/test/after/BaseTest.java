package test.after;


import emergingTrends.EmergingTrendsApplication;
import emergingTrends.repositories.ClubRepository;
import emergingTrends.repositories.SchoolRepository;
import emergingTrends.repositories.StudentRepository;
import emergingTrends.services.ClubService;
import emergingTrends.services.SchoolService;
import emergingTrends.services.SeedService;
import emergingTrends.services.StudentService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * Created by 631152 on 1/14/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmergingTrendsApplication.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class})
public class BaseTest {
    @Autowired
    public SeedService seedService;
    @Autowired
    ClubRepository clubRepository;
    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentService studentService;
    @Autowired
    SchoolService schoolService;
    @Autowired
    ClubService clubService;
}
