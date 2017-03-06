package ua.edu.sms.service;

import ua.edu.sms.entity.Attendance;

import java.util.List;

/**
 * Created by vs on 13.11.2016.
 */
public interface AttendanceService {

    void create (Attendance attendance);

    List<Attendance>findAll();

    Attendance getOne(boolean attend);

    void delete (boolean attend);

    void update (Attendance attendance);

}
