package ua.edu.sms.dao;

import ua.edu.sms.entity.Pupil;

import java.util.List;

/**
 * Created by vs on 11.11.2016.
 */
public interface PupilDao {

    void create (Pupil pupil);

    List<Pupil>getAll();

    Pupil getOne(String surname);

    void delete (String surname);

    void update (Pupil pupil);

    Pupil findOneWithMarks(String surname);

    Pupil findOneWithAttendance(String surname);

}
