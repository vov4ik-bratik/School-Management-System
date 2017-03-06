package ua.edu.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.sms.dao.TeacherDao;
import ua.edu.sms.entity.Teacher;
import ua.edu.sms.service.TeacherService;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
@Service("teacherService")
public class TeacherServiceImplement implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public void create(Teacher teacher) {
        teacherDao.create(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }

    @Override
    public Teacher getOne(String name, String surname) {
        return teacherDao.getOne(name, surname);
    }

    @Override
    public void delete(String name, String surname) {
        teacherDao.delete(name, surname);
    }

    @Override
    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }
}
