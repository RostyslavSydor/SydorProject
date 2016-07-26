package ua.lviv.sydorproject.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.sydorproject.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Rostyslav on 26.07.2016.
 */
@Repository
public class UserDaoImpl {
    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(User user) {
        entityManager.persist(user);
    }

    @Transactional
    public List<User> findAllUsers() {
        return entityManager.createQuery("from User ").getResultList();
    }

    @Transactional
    public User findOne(int id) {
        return entityManager.find(User.class, id);
    }

    public User findUserByLogin(String login) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email like :login");
        query.setParameter("login",login);
        User user = (User) query.getSingleResult();
        return user;
    }
}
