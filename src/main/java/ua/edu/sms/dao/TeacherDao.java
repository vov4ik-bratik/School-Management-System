package ua.edu.sms.dao;

import ua.edu.sms.entity.Teacher;

import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
public interface TeacherDao {

    void create (Teacher teacher);

    List<Teacher>findAll();

    Teacher getOne (String name, String surname);

    void delete (String name, String surname);

    void update (Teacher teacher);

}
