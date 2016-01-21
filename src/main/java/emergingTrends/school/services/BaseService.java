package emergingTrends.school.services;

import emergingTrends.school.repositories.ClubRepository;
import emergingTrends.school.repositories.SchoolRepository;
import emergingTrends.school.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class BaseService {
    @Autowired
    ClubRepository clubRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    StudentRepository studentRepository;

}
