package src.backend.service.userservice;

import src.backend.dto.LoginDTO;
import src.backend.model.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    private static List<User> users;
    private User loggedInUser;

    public UserServiceImpl() {
        users = new ArrayList<>();
        users.add(new User("999240051","Turdaliyev","123"));
		users.add(new User("909017194", "Alimov","qwerty"));
    }

    @Override
    public User getLoggedInUser() {
        return loggedInUser;
    }

    @Override
    public User login(LoginDTO login) {
        for (User user : users) {
            if (user.getPhonenum().equals(login.phonenumber()) && user.getUsername().equals(login.username()) && login.password().equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void removeUser(String username) {

    }

    @Override
    public List<User> getUserList() {
        return users;
    }

    @Override
    public boolean add(User user) {
        if (!users.contains(user)) {
            users.add(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public User get(String id) {
        for (User user : users) {
            if (user.getID().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getList() {
        return List.of();
    }
}
