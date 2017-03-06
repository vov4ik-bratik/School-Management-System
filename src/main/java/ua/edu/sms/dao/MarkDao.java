package ua.edu.sms.dao;

import ua.edu.sms.entity.Attendance;
import ua.edu.sms.entity.Mark;

import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
public interface MarkDao {

    void create (Mark mark);

    List<Mark> findAll();

    Mark getOne(int mark);

    void delete (int mark);

    void update (Mark mark);
}
