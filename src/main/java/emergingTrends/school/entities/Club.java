package emergingTrends.school.entities;

import com.sun.istack.internal.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by 631152 on 1/14/2016.
 */
@Entity
public class Club {
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne
    @NotNull
    private School school;

    @Size(min = 2)
    @Nullable
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "club")
    private List<Student> students;

    public Club() {

    }

    public Club(String name, School school) {
        this.id = 0;
        this.name = name;
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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
