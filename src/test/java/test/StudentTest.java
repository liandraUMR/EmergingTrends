package test;

import emergingTrends.entities.Student;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 631152 on 1/14/2016.
 */
public class StudentTest extends BaseTest
{
    private static boolean setUpIsDone = false;
    Student bob;
    Student frank;
    Student amy;

    @Before
    public void setupStatic()
    {
        bob = new Student("bob");
        frank = new Student("frank");
        amy = new Student("amy");
        setup();
    }

    private void setup()
    {
        if(setUpIsDone)
        {
            return;
        }

        studentRepository.saveAndFlush(bob);
        studentRepository.saveAndFlush(frank);
        studentRepository.saveAndFlush(amy);
        setUpIsDone = true;
    }

    @Test
    public void addSame()
    {
        //studentRepository.saveAndFlush(bob);
    }


}
