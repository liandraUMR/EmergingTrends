package emergingTrends.school.entities;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by 631152 on 1/14/2016.
 */
@Entity
public class Club
{
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne
    @NotNull
    private School school;

    @Range(min=2)
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "club")
    private Set<Student> students;

    public Club()
    {

    }

    public Club(String name) {
        this.id=0;
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

    public School getSchool()
    {
        return school;
    }

    public void setSchool(School school)
    {
        this.school = school;
    }

    public Set<Student> getStudents()
    {
        return students;
    }

    public void setStudents(Set<Student> students)
    {
        this.students = students;
    }
}
