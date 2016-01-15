package emergingTrends.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by 631152 on 1/14/2016.
 */
@Entity
public class School
{
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String name;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school")
    private Set<Club> clubs;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<Club> getClubs()
    {
        return clubs;
    }

    public void setClubs(Set<Club> clubs)
    {
        this.clubs = clubs;
    }
}
