package ua.edu.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.sms.dao.SubjectDao;
import ua.edu.sms.entity.Subject;
import ua.edu.sms.service.SubjectService;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    @Override
    public void create(Subject subject) {
        subjectDao.create(subject);
    }

    @Override
    public List<Subject> findAll() {
        return subjectDao.findAll();
    }

    @Override
    public Subject getOne(String title) {
        return subjectDao.getOne(title);
    }

    @Override
    public void delete(String title) {
        subjectDao.delete(title);
    }

    @Override
    public void update(Subject subject) {
        subjectDao.update(subject);
    }
}
