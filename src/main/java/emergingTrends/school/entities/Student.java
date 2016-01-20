package emergingTrends.school.entities;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

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

    @ManyToOne
    private School school;

    @Range(min=0, max=4)
    private double gpa;

    public Student()
    {

    }

    public Student(String name)
    {
        this.id = 0;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
