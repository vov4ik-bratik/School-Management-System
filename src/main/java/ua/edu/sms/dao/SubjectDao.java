package ua.edu.sms.dao;

import ua.edu.sms.entity.Subject;

import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
public interface SubjectDao {

    void create (Subject subject);

    List<Subject>findAll();

    Subject getOne(String title);

    void delete (String title);

    void update (Subject subject);
}
