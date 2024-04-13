package src.backend.service.userservice;

import src.backend.model.user.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public List<User> getList() {
        return List.of();
    }
}
