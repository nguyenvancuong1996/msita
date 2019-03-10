package com.msita.dao.impl;

import com.msita.dao.UserDao;
import com.msita.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    public void addUser(final User user) {
        final Session session = sessionFactory.openSession();
        session.save(user);
        session.close();
    }

    public void deleteUser(final String userId) {
        final Session session = sessionFactory.openSession();
        final User user = session.get(User.class, userId);
        if (user == null) {
            return;
        }
        session.delete(user);
        session.flush();
        session.close();
    }

    public User getUserById(final String userId) {
        final Session session = sessionFactory.openSession();
        final User user = session.get(User.class, userId);
        session.close();
        return user;
    }

    public List<User> getAllUsers() {
        final Session session = sessionFactory.openSession();
        List<User> users = session.createQuery("from User", User.class).getResultList();
        session.close();
        return users;
    }
}
