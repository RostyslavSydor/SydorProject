package ua.lviv.sydorproject.dao;

import ua.lviv.sydorproject.entity.User;

import java.util.List;

/**
 * Created by Rostyslav on 26.07.2016.
 */
public interface UserDao {
    void add(User user);

    List<User> findAllUsers();

    User fidnOne(int id);

    User findUserByLogin(String login);
}
