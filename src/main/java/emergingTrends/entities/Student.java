package emergingTrends.entities;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by 631152 on 1/14/2016.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne
    private Club club;

    @ManyToOne
    @NotNull
    private School school;

    @Range(min = 0, max = 4)
    @NotNull
    private double gpa;

    public Student() {

    }
    public Student(String name, School school,double gpa) {
        this.id = 0;
        this.name = name;
        this.school = school;
        this.gpa = gpa;
    }

    public Student(String name, School school,double gpa, Club club) {
        this.id = 0;
        this.school = school;
        this.gpa = gpa;
        this.name = name;
        this.club = club;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
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
