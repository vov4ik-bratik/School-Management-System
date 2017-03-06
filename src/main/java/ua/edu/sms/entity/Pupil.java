package ua.edu.sms.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vs on 31.10.2016.
 */
@Entity
public class Pupil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String surname;
    private String name;
    //date of birth

    //other comment


    @ManyToOne
    private Groups groups;

    @OneToMany(mappedBy = "pupil")
    private List<Mark>marks;

    @OneToMany(mappedBy = "pupil")
    private List<Attendance>attendances;

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public Pupil() {
    }

    public Pupil(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }
}
