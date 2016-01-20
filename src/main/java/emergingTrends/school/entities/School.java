package emergingTrends.school.entities;

import javax.persistence.*;
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


    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "school")
    private Set<Club> clubs;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "school")
    private Set<Student> students;

    public School(String name) {
        this.name = name;
    }

    public School(){

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

    public Set<Club> getClubs()
    {
        return clubs;
    }

    public void setClubs(Set<Club> clubs)
    {
        this.clubs = clubs;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
