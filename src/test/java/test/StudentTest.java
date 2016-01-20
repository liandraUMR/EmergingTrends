package test;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import emergingTrends.school.entities.Club;
import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.dao.DataIntegrityViolationException;

/**
 * Created by 631152 on 1/14/2016.
 */
public class StudentTest extends BaseTest
{
    private static boolean setUpIsDone = false;
    School sait;
    Club club;

    @Before
    public void setupStatic()
    {
        sait = new School("sait");
        club = new Club("heroclub");
        setup();
    }

    private void setup()
    {
        if(setUpIsDone)
        {
            return;
        }
        clubRepository.save(club);
        schoolRepository.save(sait);
        setUpIsDone = true;
    }

    @Test
    @Ignore
    public void addSchool()
    {
        Student student = studentService.findByName("bob");
        School sait = schoolRepository.findByName("sait");
        boolean result = studentService.addSchool(sait,student);
        Assert.assertEquals(result,true);
    }

    @Test
    @Ignore
    public void deleteSchool()
    {
        Student student = studentService.findByName("bob");
        School sait = schoolRepository.findByName("sait");
        boolean result = studentService.addSchool(sait,student);
        Assert.assertEquals(result,true);

        sait = schoolRepository.findByName("sait");
        schoolRepository.delete(sait);
    }
    @Test
  //  @Ignore
    public void addClub()
    {
        Student student = studentService.findByName("bob");
        Club heroClub = clubRepository.findByName("heroclub");
        boolean result = studentService.addClub(heroClub,student);
        Assert.assertEquals(result,true);

    }


}
