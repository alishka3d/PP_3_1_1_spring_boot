package academy.kata.app.boot.dao;

import academy.kata.app.boot.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
