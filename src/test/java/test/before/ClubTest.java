package test.before;
import org.junit.Before;

/**
 * Created by 631152 on 1/14/2016.
 */
public class ClubTest extends BaseTest {

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
    //TODO TDD create a club
}
