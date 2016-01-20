package emergingTrends.school.services;

import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class SchoolService extends BaseService
{
    public void update(School school)
    {

    }
    public void delete(School school)
    {

    }
    public void create(School school)
    {
        schoolRepository.save(school);
    }
    public School findByName(String name)
    {
        return null;
    }

}
