package web.dao;

import web.model.User;

import java.util.List;


public interface UserDao {
    User create(User user);
    List<User> read(long id);
    User update(User user);
    void delete(User user);
    void close();
}
