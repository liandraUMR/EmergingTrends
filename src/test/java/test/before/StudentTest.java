package test.before;

import emergingTrends.entities.Club;
import emergingTrends.entities.School;
import emergingTrends.entities.Student;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by 631152 on 1/14/2016.
 */
public class StudentTest extends BaseTest {
    private static boolean setUpIsDone = false;
    Club club;

    @Before
    public void setupStatic() {

        setup();
    }

    private void setup() {
        if (setUpIsDone) {
            return;
        }

        club.setSchool(schoolRepository.findByName("sait"));
        clubRepository.save(club);
        setUpIsDone = true;
    }

    @Test
    @Ignore
    public void addSchool() {
        Student student = studentService.findByName("bob");
        School sait = schoolRepository.findByName("sait");
        boolean result = studentService.addSchool(sait, student);
        assertEquals(result, true);
    }

    @Test
    @Ignore
    public void deleteSchool() {
        Student student = studentService.findByName("bob");
        School sait = schoolRepository.findByName("sait");
        boolean result = studentService.addSchool(sait, student);
        assertEquals(result, true);

        sait = schoolRepository.findByName("sait");
        schoolRepository.delete(sait);
    }

    @Test
    //TODO DEMO if extra time
    public void addClub() {

    }


}
