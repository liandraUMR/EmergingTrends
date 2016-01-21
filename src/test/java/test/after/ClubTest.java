package test.after;
import emergingTrends.entities.Club;
import emergingTrends.entities.School;
import emergingTrends.entities.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
/**
 * Created by 631152 on 1/14/2016.
 */
public class ClubTest extends BaseTest {
    School school;
    Club club;
    List<Student> students;
    private static boolean setUpIsDone = false;


    @Before
    public void setupStatic() {
        setup();
    }

    private void setup() {
        if (setUpIsDone) {
            return;
        }
        setUpIsDone = true;
    }


    @Test
    public void createClub()
    {
        students = new ArrayList<>();
        club = new Club("heroclub");
        school = schoolRepository.findByName("sait");
        students.add(studentRepository.findByName("amy"));
        students.add(studentRepository.findByName("fred"));

        club = clubService.create(club,school,students);

        assertEquals(1,club.getId());
        assertEquals(2,club.getStudents().size());
    }
}


//        club.setSchool(schoolRepository.findByName("sait"));
//        clubRepository.save(club);
//        List<Student> students = studentRepository.findAll();
//        club.setStudents(students);
//        for (Student student : students) {
//            student.setClub(club);
//            studentRepository.saveAndFlush(student);
//        }
//
//        club.setSchool(schoolRepository.findByName("sait"));
//        clubRepository.save(club);