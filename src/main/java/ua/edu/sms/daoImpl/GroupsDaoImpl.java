package ua.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.sms.dao.GroupsDao;
import ua.edu.sms.entity.Groups;
import ua.edu.sms.entity.Pupil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by vs on 11.11.2016.
 */
@Repository
public class GroupsDaoImpl extends GeneralDaoImpl<Groups> implements GroupsDao{

    @PersistenceContext(unitName = "Primary")
    private EntityManager entityManager;

//    @Override
//    @Transactional
//    public void create(Groups groups) {
//        entityManager.persist(groups);
//    }

//    @Override
//    @Transactional
//    public List<Groups> findAll() {
//        return entityManager.createQuery("from Groups").getResultList();
//    }

    @Override
    @Transactional
    public Groups getOne(int number, char subgroups) {
        return (Groups) entityManager.createQuery("select g from Groups g where g.number like :number and g.subgroups like :subgroups")
                .setParameter("number", number).setParameter("subgroups", subgroups)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void delete(int number, char subgroups) {
        entityManager.remove(getOne(number, subgroups));
    }

//    @Override
//    @Transactional
//    public void update(Groups groups) {
//        entityManager.merge(groups);
//    }

    @Override
    @Transactional
    public Groups findOneWithTeachers(int number, char subgroups) {
        return (Groups) entityManager.createQuery
                ("select g from Groups g left join fetch g.teachers where g.number like :number and g.subgroups like :subgroups")
                .setParameter("number", number).setParameter("subgroups", subgroups)
                .getSingleResult();
    }
}
