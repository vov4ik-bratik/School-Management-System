package ua.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.sms.dao.PupilDao;
import ua.edu.sms.entity.Pupil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by vs on 11.11.2016.
 */
@Repository
public class PupilDaoImpl extends GeneralDaoImpl<Pupil> implements PupilDao {

    @PersistenceContext(unitName = "Primary")
    private EntityManager entityManager;

//    @Transactional
//    @Override
//    public void create(Pupil pupil) {
//        entityManager.persist(pupil);
//    }

    @Transactional
    @Override
    public List<Pupil> getAll() {
        return entityManager.createQuery("from Pupil").getResultList();
    }

    @Transactional
    @Override
    public Pupil getOne(String surname) {
        return (Pupil) entityManager.createQuery("select p from Pupil p where p.surname like :surname")
                .setParameter("surname", surname).getSingleResult();
    }

    @Transactional
    @Override
    public void delete(String surname) {
        entityManager.remove(getOne(surname));

    }

//    @Override
//    public void update(Pupil pupil) {
//        entityManager.merge(pupil);
//    }

    @Transactional
    @Override
    public Pupil findOneWithMarks(String surname) {
        return (Pupil) entityManager.createQuery
                ("select p from Pupil p left join fetch p.marks where p.suname like :surname")
                .setParameter("surname", surname).getSingleResult();
    }

    @Transactional
    @Override
    public Pupil findOneWithAttendance(String surname) {
        return (Pupil) entityManager.createQuery
                ("select p from Pupil p left join fetch p.attendances where p.suname like :surname")
                .setParameter("surname", surname).getSingleResult();
    }

}
