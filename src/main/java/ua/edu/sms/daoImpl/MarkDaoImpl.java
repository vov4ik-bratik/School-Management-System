package ua.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.sms.dao.MarkDao;
import ua.edu.sms.entity.Mark;

import javax.persistence.Embedded;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
@Repository
public class MarkDaoImpl extends GeneralDaoImpl<Mark> implements MarkDao {

    @PersistenceContext(unitName = "Primary")
    private EntityManager entityManager;

//    @Override
//    @Transactional
//    public void create(Mark mark) {
//        entityManager.persist(mark);
//    }

//    @Override
//    @Transactional
//    public List<Mark> findAll() {
//        return entityManager.createQuery("from Mark").getResultList();
//    }

    @Override
    @Transactional
    public Mark getOne(int mark) {
        return (Mark) entityManager.createQuery("select m from Mark m where m.mark like :mark").
                setParameter("mark", mark).getSingleResult();
    }

    @Override
    @Transactional
    public void delete(int mark) {
        entityManager.remove(getOne(mark));
    }

//    @Override
//    @Transactional
//    public void update(Mark mark) {

    }
