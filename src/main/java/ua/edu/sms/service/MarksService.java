package ua.edu.sms.service;

import ua.edu.sms.entity.Mark;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
public interface MarksService {

    void create (Mark mark);

    List<Mark> findAll();

    Mark getOne(int mark);

    void delete (int mark);

    void update (Mark mark);
}
