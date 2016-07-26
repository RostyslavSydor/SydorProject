package ua.lviv.sydorproject.services.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.sydorproject.dao.ClientDao;
import ua.lviv.sydorproject.entity.Client;
import ua.lviv.sydorproject.services.ClientService;
import java.util.List;

/**
 * Created by Rostyslav on 25.07.2016.
 */
@Service
public class ClientServiceImpl  implements ClientService{

    @Autowired
    private ClientDao clientDao;

    @Transactional
    public void add(String name, String country) {
       Client client = new Client(name, country);
        clientDao.add(client);


    }

    public List<Client> findAll() {
        return null;
    }

    public Client findById(int id) {
        return null;
    }

}
