package ua.edu.sms.service;

import ua.edu.sms.entity.Groups;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
public interface GroupsService {

    void create (Groups groups);

    List<Groups> findAll();

    Groups getOne(int number, char subgroups);

    void delete (int number, char subgroups);

    void update (Groups groups);

    Groups findOneWithTeachers (int number, char subgroups);

}
