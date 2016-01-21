package emergingTrends.repositories;

import emergingTrends.entities.Club;
import emergingTrends.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 631152 on 1/14/2016.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByName(String name);

    List<Student> findByClub(Club club);
}
