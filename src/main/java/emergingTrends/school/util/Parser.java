package emergingTrends.school.util;

import emergingTrends.school.repositories.ClubRepository;
import emergingTrends.school.repositories.SchoolRepository;
import emergingTrends.school.repositories.StudentRepository;

import java.io.IOException;

/**
 * Created by 631152 on 1/20/2016.
 */
public class Parser {

    public SeedRepository seedRepository;
    SchoolRepository schoolRepository;
    StudentRepository studentRepository;
    ClubRepository clubRepository;

    public Object parser(String string) throws IOException {
        String[] split = string.split(":");

        if (split[0].equalsIgnoreCase("student")) {
            String[] studentSplit = split[1].split(";");
            schoolRepository.findByName(split[1]);

            return seedRepository.createStudent(studentSplit[0], schoolRepository.findByName(studentSplit[1]), clubRepository
                    .findByName(split[2]));
        } else if (split[0].equalsIgnoreCase("school")) {
            String[] schoolSplit = split[1].split(";");
            return seedRepository.createSchool(schoolSplit[0]);
        } else if (split[0].equalsIgnoreCase("club")) {
            String[] clubSplit = split[1].split(";");

            return seedRepository.createClub(clubSplit[0], schoolRepository.findByName(clubSplit[1]));
        }

        return null;
    }


}
