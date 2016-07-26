package ua.lviv.sydorproject.dao;

import ua.lviv.sydorproject.entity.Client;

import java.util.List;

/**
 * Created by Rostyslav on 26.07.2016.
 */
public interface ClientDao {
    void add(Client client);
    List<Client> findAllClients();

    Client findOne(int id);
}
