package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    User create(User user);
    List<User> read(long id);
    User update(User user);
    void delete(User user);
    void close();
}
