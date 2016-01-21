package emergingTrends.services;

import emergingTrends.repositories.ClubRepository;
import emergingTrends.repositories.SchoolRepository;
import emergingTrends.repositories.StudentRepository;
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
