package ua.lviv.sydorproject.services;

import ua.lviv.sydorproject.entity.Client;
import ua.lviv.sydorproject.entity.Product;

import java.util.List;

/**
 * Created by Rostyslav on 25.07.2016.
 */
public interface ProductService {

    void add(String name, int price, String id);

    List<Product> findAllProducts();

    List<Client> findAll();
}
