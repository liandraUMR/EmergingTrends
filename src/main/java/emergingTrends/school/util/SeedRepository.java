package emergingTrends.school.util;

import emergingTrends.school.entities.Club;
import emergingTrends.school.entities.School;
import emergingTrends.school.entities.Student;

/**
 * Created by 631152 on 1/20/2016.
 */
public interface SeedRepository {
    School createSchool(String school);

    Student createStudent(String name, School school, Club club);

    Club createClub(String name, School school);
}
