package ua.edu.sms.service;

import ua.edu.sms.entity.Subject;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
public interface SubjectService {

    void create (Subject subject);

    List<Subject> findAll();

    Subject getOne(String title);

    void delete (String title);

    void update (Subject subject);
}
