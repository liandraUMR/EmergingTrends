import emergingTrends.school.entities.Club;
import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;
import emergingTrends.school.util.Parser;
import emergingTrends.school.util.SeedRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import test.BaseTest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit Testing Situation 1.
 * You are developing the seed service method for your application. The database & parser is incomplete.
 * To ensure it works, you will see if you can successfully sort the data in the file
 * <p>
 * Unit Testing Situation 2.
 * The parser is complete but we are unsure if it works as inteded.
 * Create a list of unit tests to check if the parser works.
 */
public class ParsingTest extends BaseTest {
    private static boolean setUpIsDone = false;
    List<Student> students;
    List<School> schools;
    List<Club> clubs;
    SeedRepository seedRepository;
    String saitStr;
    String uofcStr;
    School sait;
    School uofc;

    @Before
    public void preSetup() {
        if (setUpIsDone) {
            return;
        }
        setUpIsDone = true;
        students = new ArrayList<>();
        schools = new ArrayList<>();
        clubs = new ArrayList<>();

        setUpIsDone = true;
    }

    @Before
    public void setup() {
        saitStr = "school:sait";
        uofcStr = "school:uofc";
    }

    @Test
    public void schoolParse() throws IOException {

        //setup
        seedRepository = Mockito.mock(SeedRepository.class);
        Parser parser = new Parser();

        parser.seedRepository = seedRepository;
        Mockito.when(seedRepository.createSchool("sait")).thenReturn(sait);

        //execution
        schools.add((School) parser.parser(saitStr));

        //verification
        Mockito.verify(seedRepository).createSchool("sait");
        assertEquals(1, schools.size());
    }

    @After
    public void after() {

    }
}
