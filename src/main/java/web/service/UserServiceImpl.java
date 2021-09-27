package web.service;

import web.dao.UserDao;
import web.dao.UserDaoHibernateImpl;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoHibernateImpl();

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public User read(long id) {
        return userDao.read(id);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void close() {
        userDao.close();
    }
}
