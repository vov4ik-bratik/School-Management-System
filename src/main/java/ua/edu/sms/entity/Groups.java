package ua.edu.sms.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vs on 31.10.2016.
 */
@Entity
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    private char subgroups;

    @OneToMany(mappedBy = "groups")
    private List<Pupil> pupils;

    @ManyToMany
    @JoinTable(name = "Teacher_Groups_Subj",
            joinColumns = @JoinColumn(name = "groups_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher>teachers;

    @ManyToMany
    @JoinTable(name = "Teacher_Groups_Subj",
            joinColumns = @JoinColumn(name = "groups_id"),
            inverseJoinColumns = @JoinColumn(name = "subj_id"))
    private List<Subject>subjects;


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Groups() {
    }

    public Groups(int number, char subgroups) {
        this.number = number;
        this.subgroups = subgroups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getSubgroups() {
        return subgroups;
    }

    public void setSubgroup(char subgroups) {
        this.subgroups = subgroups;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }
}
