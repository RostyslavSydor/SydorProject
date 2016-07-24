package ua.lviv.sydorproject.dao.implementation;

import ua.lviv.sydorproject.dao.ClientDao;
import ua.lviv.sydorproject.entity.Client;

/**
 * Created by Rostyslav on 25.07.2016.
 */
@Repository
public class ClientDaoImpl implements ClientDao {
    public void add(Client client) {

        @PersistenceContext(unitName = "qwerty")
        private EntityManager entityManager;

        public void add(Client client)(
                entityManager.persist(client)
                )
    }
}
