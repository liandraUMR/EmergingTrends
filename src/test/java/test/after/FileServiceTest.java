package test.after;

import emergingTrends.entities.School;
import emergingTrends.repositories.ClubRepository;
import emergingTrends.repositories.SchoolRepository;
import emergingTrends.repositories.StudentRepository;
import emergingTrends.util.FileService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;


/**
 * Created by bmart on 20-Jan-2016.
 */
public class FileServiceTest extends BaseTest {
    String schoolSeed ="school:sait";
    String fileName="src/test/resources/testFile.txt";
    FileService fileService;
    @Before
    public void setup()
    {
        schoolRepository = Mockito.mock(SchoolRepository.class);
        studentRepository = Mockito.mock(StudentRepository.class);
        clubRepository = Mockito.mock(ClubRepository.class);
    }

    //partial mock
    @Test
    public void fileReaderTest()
    {
        fileService = Mockito.mock(FileService.class);
        Mockito.when(fileService.parser(schoolSeed)).thenReturn(null);
        Mockito.when(fileService.fileReader(fileName)).thenCallRealMethod();

        boolean result =fileService.fileReader(fileName);
        Mockito.verify(fileService).parser(schoolSeed);
        assertEquals(true,result);
    }

    //mock with stubbing
    @Test
    public void parseSchoolTest()
    {
        //setup
        fileService = Mockito.mock(FileService.class);
        School school = Mockito.mock(School.class);

        Mockito.when(schoolRepository.saveAndFlush(any(School.class))).thenReturn(school);

        FileService fileService = new FileService();
        fileService.schoolRepository = schoolRepository;

        //execution
        school = (School) fileService.parser(schoolSeed);

        //checks
        Mockito.verify(schoolRepository).saveAndFlush(any(School.class));
        assertThat(school,instanceOf(School.class));

    }

    //the entire "unit" after.test
    @Test
    public void readWithParse()
    {
        //setup
        fileService = new FileService();

        School school = Mockito.mock(School.class);
        Mockito.when(schoolRepository.saveAndFlush(any(School.class))).thenReturn(school);
        fileService.schoolRepository = schoolRepository;

        boolean result = fileService.fileReader(fileName);

        Mockito.verify(schoolRepository).saveAndFlush(any(School.class));
        assertTrue(result);
    }



}

