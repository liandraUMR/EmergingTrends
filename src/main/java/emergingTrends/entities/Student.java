package emergingTrends.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by 631152 on 1/14/2016.
 */
@Entity
public class Student
{
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne
    private Club club;

    public Student(String name)
    {
        this.name = name;
    }

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

    public Club getClub()
    {
        return club;
    }

    public void setClub(Club club)
    {
        this.club = club;
    }
}
