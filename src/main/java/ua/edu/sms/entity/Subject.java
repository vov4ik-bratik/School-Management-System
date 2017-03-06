package ua.edu.sms.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vs on 10.11.2016.
 */
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String title;

    @OneToMany(mappedBy = "subject")
    private List<Mark>marks;

    @OneToMany(mappedBy = "subject")
    private List<Attendance>attendances;

    @ManyToMany
    @JoinTable(name = "Teacher_Groups_Subj",
            joinColumns = @JoinColumn(name = "subj_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher>teachers;

    @ManyToMany
    @JoinTable(name = "Teacher_Groups_Subj",
    joinColumns = @JoinColumn(name = "subj_id"),
    inverseJoinColumns = @JoinColumn(name = "groups_id"))
    private List<Groups>groups;

    public List<Groups> getGroups() {
        return groups;
    }

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Subject() {
    }

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

    public Subject(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
