package emergingTrends.school.services;

import emergingTrends.school.entities.Club;
import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class StudentService extends BaseService
{
    private boolean update(Student student)
    {
        if(student.getId() != 0) {
            studentRepository.saveAndFlush(student);
            return true;
        }
        return false;

    }


    public boolean delete(Student student)
    {
        student =findByName(student.getName());

        if(student== null)
            return false;

        studentRepository.delete(student);
        return true;
    }


    public boolean create(Student student)
    {
        if(student.getId() == 0)
        {
            studentRepository.save(student);
            return true;
        }else
        return false;
    }

    public boolean addSchool(School school, Student student)
    {
        if(student.getGpa()< 2)
        {
            return false;
        }
        else
        {
            student.setSchool(school);
            update(student);
            return true;
        }
    }
    public boolean addClub(Club club,Student student)
    {
        student.setClub(club);
        update(student);
        return true;
    }

    public Student findByName(String name)
    {
        return studentRepository.findByName(name);
    }
}
