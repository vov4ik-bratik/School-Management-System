package ua.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.sms.dao.GeneralDao;
import ua.edu.sms.dao.SubjectDao;
import ua.edu.sms.entity.Subject;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
@Repository
public class SubjectDaoImpl extends GeneralDaoImpl<Subject> implements SubjectDao {

    @PersistenceContext (unitName = "Primary")
    private EntityManager entityManager;

//    @Override
//    @Transactional
//    public void create(Subject subject) {
//        entityManager.persist(subject);
//    }

//    @Override
//    @Transactional
//    public List<Subject> findAll() {
//        return entityManager.createQuery("from Subject").getResultList();
//    }

    @Override
    @Transactional
    public Subject getOne(String title) {
        return (Subject) entityManager.createQuery("select s from Subject s where s.title like :title")
                .setParameter("title", title).getSingleResult();
    }

    @Override
    @Transactional
    public void delete(String title) {
        entityManager.remove(getOne(title));
    }

//    @Override
//    @Transactional
//    public void update(Subject subject) {
//        entityManager.merge(subject);
//    }
}
