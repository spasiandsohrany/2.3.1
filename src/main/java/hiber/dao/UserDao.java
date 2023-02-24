package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {

    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
}
