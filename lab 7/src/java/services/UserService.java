
package services;

import dataaccess.usersDB;
import java.util.ArrayList;
import models.Role;
import models.User;


public class UserService {
    
    public User get(String email) throws Exception {
        usersDB userdb = new usersDB();
        User user = userdb.get(email);
        return user;
    }
    
    public ArrayList<User> getAll() throws Exception {
        usersDB userdb = new usersDB();
        ArrayList<User> users = userdb.getAll();
        return users;
    }
    
    public void insert(String email, String firstname, String lastname, String password, int roleID) throws Exception {
        Role role = new Role(roleID);
        User user = new User(email,firstname,lastname,password,role);
        usersDB userdb = new usersDB();
        userdb.insert(user);
    }
    
    public void update(String email, String firstname, String lastname, String password, int roleID) throws Exception {
        Role role = new Role(roleID);
        User user = new User(email,firstname,lastname,password,role);
        usersDB userdb = new usersDB();
        userdb.update(user);
    }
    
    public void delete(String email) throws Exception {
        User user = new User();
        user.setEmail(email);
        usersDB userdb = new usersDB();
        userdb.delete(user);
    }

}
