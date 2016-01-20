package emergingTrends.school.util;

import emergingTrends.school.entities.Club;
import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;
import emergingTrends.school.repositories.ClubRepository;
import emergingTrends.school.repositories.SchoolRepository;
import emergingTrends.school.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * Created by 631152 on 1/20/2016.
 */
public class Parser
{

    SchoolRepository schoolRepository;
    StudentRepository studentRepository;
    ClubRepository clubRepository;
    EntityController entityController;

    public Object parser(String string) throws IOException
    {
        String[] split = string.split(":");

        if(split[0].equalsIgnoreCase("student"))
        {
            String[] studentSplit = split[1].split(";");
            schoolRepository.findByName(split[1]);

            return entityController.createStudent(studentSplit[0],schoolRepository.findByName(studentSplit[1]),clubRepository
                    .findByName(split[2]));
        }
        else if(split[0].equalsIgnoreCase("school"))
        {
             String[] schoolSplit = split[1].split(";");
            return entityController.createSchool(schoolSplit[0]);
        }
        else if(split[0].equalsIgnoreCase("club"))
        {
            String[] clubSplit = split[1].split(";");

            return entityController.createClub(clubSplit[0],schoolRepository.findByName(clubSplit[1]));
        }

        return null;
    }




}
