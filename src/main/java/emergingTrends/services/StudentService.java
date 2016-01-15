package emergingTrends.services;

import emergingTrends.entities.Student;
import org.springframework.stereotype.Service;

/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class StudentService extends BaseService
{
    private boolean update(Student student)
    {
        student = findByName(student.getName());
        if(student == null)
            return false;

        student = studentRepository.findByName(student.getName());
        return true;
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

        if(student != null)
            return false;



        studentRepository.save(student);
        return true;
    }


    public Student findByName(String name)
    {
        return studentRepository.findByName(name);
    }
}
