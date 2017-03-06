package ua.edu.sms.dao;

import java.util.List;

/**
 * Created by vs on 12.11.2016.
 */
public interface GeneralDao<T> {

    void create (T t);

    List<T> findAll();

    void update (T t);
}
