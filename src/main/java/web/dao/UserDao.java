package web.dao;

import web.model.User;


public interface UserDao {
    User create(User user);
    User read(long id);
    User update(User user);
    void delete(User user);
    void close();
}
