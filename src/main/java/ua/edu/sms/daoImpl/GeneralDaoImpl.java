package ua.edu.sms.daoImpl;

import org.springframework.transaction.annotation.Transactional;
import ua.edu.sms.dao.GeneralDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
public class GeneralDaoImpl<T> implements GeneralDao<T> {

    @PersistenceContext(unitName = "Primary")
    private EntityManager entityManager;

    private Class<T> entity;

    @Override
    @Transactional
    public void create(T t) {
    }

    @Override
    @Transactional
    public List<T> findAll() {
        return entityManager.createQuery("from "+entity.getClass().getSimpleName()).getResultList();
    }

    @Override
    @Transactional
    public void update(T t) {
        entityManager.merge(t);
    }
}
