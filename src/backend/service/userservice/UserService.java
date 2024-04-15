package src.backend.service.userservice;

import src.backend.dto.LoginDTO;
import src.backend.model.user.User;
import src.backend.service.baseservice.BaseService;

import java.util.List;

public interface UserService extends BaseService<User> {
    User getLoggedInUser();
    User login(LoginDTO login);
    User getUserByUsername(String username);
    void removeUser(String username);
    List<User> getUserList();
    boolean add(User user);
    boolean delete(String id);
    User get(String id);
}
