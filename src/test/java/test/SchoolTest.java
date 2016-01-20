package test;

import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import java.util.Set;

/**
 * Created by bmart on 19-Jan-2016.
 */
public class SchoolTest extends BaseTest{

    private static boolean setUpIsDone = false;
    School sait;

    @Before
    public void setupStatic()
    {
        sait = new School("sait");
        setup();
    }

    private void setup()
    {
        if(setUpIsDone)
        {
            return;
        }
        schoolRepository.save(sait);
        setUpIsDone = true;
    }

    @Test
    @Ignore
    public void addStudent()
    {
        Student student = studentService.findByName("bob");
        //boolean result = schoolService.addStudent(sait,student);
        //Assert.assertEquals(result,true);
    }

    @Test
    @Ignore
    public void findStudent()
    {
        Student student = studentService.findByName("bob");
        //boolean result = schoolService.addStudent(sait,student);
       // Assert.assertEquals(result,true);

        School sait2 = schoolRepository.findByName("sait");
        Set<Student> students = sait2.getStudents();
        Assert.assertEquals(1,students.size());
    }
}