package ua.edu.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.sms.dao.AttendanceDao;
import ua.edu.sms.entity.Attendance;
import ua.edu.sms.service.AttendanceService;

import java.util.List;

/**
 * Created by vs on 13.11.2016.
 */
@Service("attendanceSerivece")
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public void create(Attendance attendance) {
        attendanceDao.create(attendance);
    }

    @Override
    public List<Attendance> findAll() {
        return attendanceDao.findAll();
    }

    @Override
    public Attendance getOne(boolean attend) {
        return attendanceDao.getOne(attend);
    }

    @Override
    public void delete(boolean attend) {
        attendanceDao.delete(attend);
    }

    @Override
    public void update(Attendance attendance) {
        attendanceDao.update(attendance);
    }
}
