package test.before;

import emergingTrends.entities.School;
import emergingTrends.entities.Student;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
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
    //TODO integration test demo
    public void findStudents() {

    }
}
