package ua.lviv.sydorproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.sydorproject.entity.Client;
import ua.lviv.sydorproject.services.ProductService;

import javax.persistence.Column;
import java.util.List;

/**
 * Created by Rostyslav on 26.07.2016.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/createProduct", method = RequestMethod.GET)
    public String addProduct (Model model){
        List<Client> clientList = productService.findAll();
        model.addAttribute("clients", clientList);
        return "product-new";
    }

    @RequestMapping(value = "/createProduct", method = RequestMethod.POST)
    private String createProduct (@RequestParam("name")String name, @RequestParam("price")String pages, @RequestParam("client")String id){
        productService.add(name, Integer.parseInt(pages), id);
        return "redirect:/";
    }

    @RequestMapping(value = "/allProducts", method = RequestMethod.GET)
    public String allBooks(Model model){
        model.addAttribute("products", productService.findAllProducts());
        return "product-all";
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}


