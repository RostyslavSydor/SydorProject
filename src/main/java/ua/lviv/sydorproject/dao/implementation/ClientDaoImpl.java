package ua.lviv.sydorproject.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.sydorproject.dao.ClientDao;
import ua.lviv.sydorproject.entity.Client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Rostyslav on 26.07.2016.
 */
@Repository
public class ClientDaoImpl implements ClientDao{


    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;


    @Transactional
    public void add(Client client) {
        entityManager.persist(client);
    }

    public List<Client> findAllClients() {
        return null;
    }
    @Transactional
    public List<Client> findAllAuthors() {
        return entityManager.createQuery("from Client ").getResultList();
    }

    @Transactional
    public void delete(Client client){
        entityManager.remove(client);
    }

    public Client findOne(int id){
        return entityManager.find(Client.class, id);
    }
}
