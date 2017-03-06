package ua.edu.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.sms.dao.MarkDao;
import ua.edu.sms.entity.Mark;
import ua.edu.sms.service.MarksService;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
@Service("marksService")
public class MarksServiceImpl implements MarksService {

    @Autowired
    private MarkDao markDao;

    @Override
    public void create(Mark mark) {
        markDao.create(mark);
    }

    @Override
    public List<Mark> findAll() {
        return markDao.findAll();
    }

    @Override
    public Mark getOne(int mark) {
        return markDao.getOne(mark);
    }

    @Override
    public void delete(int mark) {
        markDao.delete(mark);
    }

    @Override
    public void update(Mark mark) {
        markDao.update(mark);
    }
}
