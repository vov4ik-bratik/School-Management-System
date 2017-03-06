package ua.edu.sms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.sms.dao.GroupsDao;
import ua.edu.sms.entity.Groups;
import ua.edu.sms.service.GroupsService;

import java.util.List;

/**
 * Created by vs on 14.11.2016.
 */
@Service("groupsService")
public class GroupsServiceImpl implements GroupsService {

    @Autowired
    private GroupsDao groupsDao;

    @Override
    public void create(Groups groups) {
        groupsDao.create(groups);
    }

    @Override
    public List<Groups> findAll() {
        return groupsDao.findAll();
    }

    @Override
    public Groups getOne(int number, char subgroups) {
        return groupsDao.getOne(number, subgroups);
    }

    @Override
    public void delete(int number, char subgroups) {
        groupsDao.delete(number, subgroups);
    }

    @Override
    public void update(Groups groups) {
        groupsDao.update(groups);
    }

    @Override
    public Groups findOneWithTeachers(int number, char subgroups) {
        return groupsDao.findOneWithTeachers(number, subgroups);
    }
}
