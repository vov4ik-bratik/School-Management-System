package ua.edu.sms.dao;

import ua.edu.sms.entity.Groups;
import ua.edu.sms.entity.Pupil;

import java.util.List;

/**
 * Created by vs on 11.11.2016.
 */
public interface GroupsDao {

    void create (Groups groups);

    List<Groups>findAll();

    Groups getOne(int number, char subgroups);

    void delete (int number, char subgroups);

    void update (Groups groups);

    Groups findOneWithTeachers (int number, char subgroups);


}
