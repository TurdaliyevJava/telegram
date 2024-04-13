package src.backend.model.user;

import src.backend.model.basemodel.BaseModel;

public class User extends BaseModel {
    private String phonenum;
    private String username;
    private String password;

    public User(String phonenum, String username, String password) {
        this.phonenum = phonenum;
        this.username = username;
        this.password = password;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
