package ua.edu.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.sms.dao.PupilDao;
import ua.edu.sms.entity.Pupil;
import ua.edu.sms.service.PupilService;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
@Service("pupilService")
public class PupilServiceImpl implements PupilService {

    @Autowired
    private PupilDao pupilDao;

    @Override
    public void create(Pupil pupil) {
        pupilDao.create(pupil);
    }

    @Override
    public List<Pupil> getAll() {
        return pupilDao.getAll();
    }

    @Override
    public Pupil getOne(String surname) {
        return pupilDao.getOne(surname);
    }

    @Override
    public void delete(String surname) {
        pupilDao.delete(surname);
    }

    @Override
    public void update(Pupil pupil) {
        pupilDao.update(pupil);
    }

    @Override
    public Pupil findOneWithMarks(String surname) {
        return pupilDao.findOneWithMarks(surname);
    }

    @Override
    public Pupil findOneWithAttendance(String surname) {
        return pupilDao.findOneWithAttendance(surname);
    }
}
