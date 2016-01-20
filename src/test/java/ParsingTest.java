import emergingTrends.school.entities.Club;
import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;
import emergingTrends.school.util.EntityController;

import emergingTrends.school.util.EntityControllerImplemented;
import emergingTrends.school.util.Parser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import test.BaseTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**Unit Testing Situation 1.
 * You are developing the seed service method for your application. The database & parser is incomplete.
 * To ensure it works, you will see if you can successfully sort the data in the file
 *
 * Unit Testing Situation 2.
 * The parser is complete but we are unsure if it works as inteded.
 * Create a list of unit tests to check if the parser works.
 *
 */
public class ParsingTest extends BaseTest
{
    List<Student> students;
    List<School> schools;
    List<Club> clubs;
    EntityController entityController;
    String saitStr;
    String uofcStr;
    School sait;
    School uofc;
    private static boolean setUpIsDone = false;

    @Before
    public void preSetup()
    {
        if(setUpIsDone)
        {
            return;
        }
        setUpIsDone = true;
        students = new ArrayList<>();
        schools = new ArrayList<>();
        clubs = new ArrayList<>();

        setUpIsDone=true;
    }
    @Before
    public void setup()
    {
        saitStr  = "school:sait";
        uofcStr = "school:uofc";
    }
    @Test
    public void schoolParse() throws IOException
    {
        School school = Mockito.mock(School.class);
        entityController =  Mockito.mock(EntityControllerImplemented.class);
        Parser parser = new Parser();
        Mockito.when(entityController.createSchool("sait")).thenReturn(sait);
        schools.add((School) parser.parser(saitStr));
        Mockito.verify(entityController.createSchool("sait"));
        Assert.assertEquals(1,schools.size());

    }
}
