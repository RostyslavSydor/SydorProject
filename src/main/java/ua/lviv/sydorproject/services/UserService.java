package ua.lviv.sydorproject.services;

import ua.lviv.sydorproject.entity.User;

import java.util.List;

/**
 * Created by Rostyslav on 26.07.2016.
 */
public interface UserService {

    void add(User user);

    List<User> findAllUsers();

}
