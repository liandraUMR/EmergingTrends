package emergingTrends.util;

import emergingTrends.entities.Club;
import emergingTrends.entities.School;
import emergingTrends.entities.Student;
import emergingTrends.repositories.ClubRepository;
import emergingTrends.repositories.SchoolRepository;
import emergingTrends.repositories.StudentRepository;

import java.io.*;

/**
 * Created by 631152 on 1/20/2016.
 */
public class FileService {

    public SchoolRepository schoolRepository;
    public StudentRepository studentRepository;
    public ClubRepository clubRepository;

    public Object parser(String string) {

        String[] strip = string.split(":");

        if (strip[0].equalsIgnoreCase("student"))
        {
            String[] split = strip[1].split(";");
            Student student = new Student(split[0], schoolRepository.findByName(split[1]),Double.parseDouble(split[2]), clubRepository.findByName(split[3]));
            return studentRepository.saveAndFlush(student);

        }else if (strip[0].equalsIgnoreCase("school"))
        {
            String[] split = strip[1].split(";");
            School school = new School(split[0]);
            return schoolRepository.saveAndFlush(school);

        }else if (strip[0].equalsIgnoreCase("club"))
        {
            String[] split = strip[1].split(";");
            Club club = new Club(split[0], schoolRepository.findByName(split[1]));
            return clubRepository.saveAndFlush(club);
        }

        return null;
    }
    public boolean fileReader(String filepath)  {
        try {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        String line;

        while((line = bufferedReader.readLine()) !=null)
        {
            School school = (School) parser(line);
            System.out.println("SCHOOL"+school);
//            if(parser(line).equals(null));
//            {
//                return false;
//            }
        }
        bufferedReader.close();
        return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


}
