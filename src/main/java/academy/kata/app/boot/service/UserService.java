package academy.kata.app.boot.service;

import academy.kata.app.boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
