package test;

import emergingTrends.entities.School;
import emergingTrends.entities.Student;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

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
        schoolRepository.save(sait);
        setUpIsDone = true;
    }

    @Test
    @Ignore
    public void addStudent() {
        Student student = studentService.findByName("bob");
        //boolean result = schoolService.addStudent(sait,student);
        //assertEquals(result,true);
    }

    @Test
    @Ignore
    public void findStudent() {
        Student student = studentService.findByName("bob");
        //boolean result = schoolService.addStudent(sait,student);
        // Assert.assertEquals(result,true);

        School sait2 = schoolRepository.findByName("sait");
        Set<Student> students = sait2.getStudents();
        assertEquals(1, students.size());
    }
}
