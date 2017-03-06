package ua.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.sms.dao.AttendanceDao;
import ua.edu.sms.entity.Attendance;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
@Repository
public class AttendanceDaoImpl extends GeneralDaoImpl<Attendance> implements AttendanceDao {

    @PersistenceContext(unitName = "Primary")
    private EntityManager entityManager;

//    @Override
//    @Transactional
//    public void create(Attendance attendance) {
//        entityManager.persist(attendance);
//    }

//    @Override
//    @Transactional
//    public List<Attendance> findAll() {
//        return entityManager.createQuery("from Attendance").getResultList();
//    }

    @Override
    @Transactional
    public Attendance getOne(boolean attend) {
        return (Attendance) entityManager.createQuery("select a from Attendance a where a.attend like :attend")
                .setParameter("attend", attend).getSingleResult();
    }

    @Override
    @Transactional
    public void delete(boolean attend) {
        entityManager.remove(getOne(attend));
    }

//    @Override
//    @Transactional
//    public void update(Attendance attendance) {
//        entityManager.merge(attendance)
//    }
}
