package emergingTrends.services;

import emergingTrends.entities.School;
import org.springframework.stereotype.Service;

/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class SchoolService extends BaseService {
    public void update(School school) {

    }

    public void delete(School school) {

    }

    public void create(School school) {
        schoolRepository.save(school);
    }

    public School findByName(String name) {
        return null;
    }

}
