package ua.lviv.sydorproject.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Rostyslav on 24.07.2016.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String id;

    public Client() {
    }

    @Column
    private String name;
    @Column
    private String country;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Product> productList;


    public Client(String name, String country) {
    }



    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", productList=" + productList +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
