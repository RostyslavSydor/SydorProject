package ua.lviv.sydorproject.services;

import ua.lviv.sydorproject.entity.Client;

import java.util.List;

/**
 * Created by Rostyslav on 25.07.2016.
 */
public interface ClientService {

    void add(String name, String country);

    List<Client> findAll();

    Client findById(int i);
}
