package ua.edu.sms.dao;

import ua.edu.sms.entity.Attendance;
import ua.edu.sms.entity.Groups;
import ua.edu.sms.entity.Pupil;

import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
public interface AttendanceDao {

    void create (Attendance attendance);

    List<Attendance> findAll();

    Attendance getOne(boolean attend);

    void delete (boolean attend);

    void update (Attendance attendance);
}
