package test.after;

import emergingTrends.entities.School;
import emergingTrends.entities.Student;
import org.junit.Before;
import org.junit.Test;
import test.after.BaseTest;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by bmart on 19-Jan-2016.
 */
public class SchoolTest extends BaseTest {

    private static boolean setUpIsDone = false;
    School sait;

    @Before
    public void setupStatic() {
        sait = new School("sait");
        setup();
    }

    private void setup() {
        if (setUpIsDone) {
            return;
        }
       // schoolRepository.save(sait);
        setUpIsDone = true;
    }

    @Test
    public void findStudents() {
        School sait2 = schoolRepository.findByName("sait");
        Set<Student> students = sait2.getStudents();
        assertEquals(3, students.size());
    }
}
