package ua.lviv.sydorproject.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.sydorproject.dao.ProductDao;
import ua.lviv.sydorproject.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Rostyslav on 25.07.2016.
 */
@Repository
public class ProductDaoImpl implements ProductDao {


    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Product product) {
        entityManager.persist(product);
    }

    public List<Product> findAllProducts() {
        return null;
    }

    public List<Product> findAllBooks() {
        return entityManager.createQuery("from Product ").getResultList();}
    }
