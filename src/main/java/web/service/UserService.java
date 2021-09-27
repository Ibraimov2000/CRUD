package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

@Service
public interface UserService {
    User create(User user);
    User read(long id);
    User update(User user);
    void delete(User user);
    void close();
}
