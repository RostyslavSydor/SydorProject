package ua.lviv.sydorproject.dao;

import ua.lviv.sydorproject.entity.Product;

import java.util.List;
import java.util.Locale;

/**
 * Created by Rostyslav on 25.07.2016.
 */
public interface ProductDao {

    void add(Product product);

    List<Product> findAllProducts();
}
