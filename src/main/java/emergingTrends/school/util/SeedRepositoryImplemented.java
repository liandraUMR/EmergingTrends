package emergingTrends.school.util;

import emergingTrends.school.entities.Club;
import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;

/**
 * Created by 631152 on 1/20/2016.
 */
public class SeedRepositoryImplemented implements SeedRepository {

    @Override
    public School createSchool(String str) {
        return new School(str);

    }

    @Override
    public Student createStudent(String name, School school, Club club) {
        return new Student(name, school, club);
    }

    @Override
    public Club createClub(String name, School school) {

        return new Club(name, school);
    }
}
