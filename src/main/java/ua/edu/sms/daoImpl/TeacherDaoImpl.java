package ua.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.sms.dao.TeacherDao;
import ua.edu.sms.entity.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
@Repository
public class TeacherDaoImpl extends GeneralDaoImpl<Teacher> implements TeacherDao {

    @PersistenceContext (unitName = "Primary")
    private EntityManager entityManager;

//    @Override
//    @Transactional
//    public void create(Teacher teacher) {
//        entityManager.persist(teacher);
//    }


//    @Override
//    @Transactional
//    public List<Teacher> findAll() {
//        return entityManager.createQuery("from Teacher").getResultList();
//    }

    @Override
    @Transactional
    public Teacher getOne(String name, String surname) {
        return (Teacher) entityManager.createQuery("select t from Teacher t where t.name like :name and t.surname like :surname")
                .setParameter("surname", surname).setParameter("name", name).getSingleResult();
    }

    @Override
    @Transactional
    public void delete(String name, String surname) {
        entityManager.remove(getOne(name, surname));
    }

//    @Override
//    @Transactional
//    public void update(Teacher teacher) {
//        entityManager.merge(teacher);
//    }
}
