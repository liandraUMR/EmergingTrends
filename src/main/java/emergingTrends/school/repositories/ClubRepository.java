package emergingTrends.school.repositories;

import emergingTrends.school.entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 631152 on 1/14/2016.
 */
@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
    Club findByName(String name);
}
