package emergingTrends.services;

import emergingTrends.entities.Club;
import org.springframework.stereotype.Service;

/**
 * Created by 631152 on 1/14/2016.
 */
@Service
public class ClubService extends BaseService
{
    public boolean update(Club club) throws Exception
    {
        club = findByName(club.getName());
        return true;
    }
    public boolean delete(Club club) throws Exception
    {
        club = findByName(club.getName());
        return true;
    }
    public boolean create(Club club) throws Exception
    {


        if(club == null)
            throw new Exception("Club does not exist");

        if(club.getStudents().size() < 3)
            throw new Exception("Club must have at least 3 students");

        clubRepository.save(club);
        return true;

    }
    public Club findByName(String name)
    {
        return clubRepository.findByName(name);
    }
}
